package cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import javax.validation.constraints.*;
import javax.validation.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.behaviorrecords.BehaviorRecordsDO;
import cn.iocoder.yudao.module.yideyifeng.service.behaviorrecords.BehaviorRecordsService;

@Tag(name = "管理后台 - 行为记录")
@RestController
@RequestMapping("/yideyifeng/behavior-records")
@Validated
public class BehaviorRecordsController {

    @Resource
    private BehaviorRecordsService behaviorRecordsService;

    @Value("classpath:医德档案考评表.xlsx")
    private org.springframework.core.io.Resource resource;

    @PostMapping("/create")
    @Operation(summary = "创建行为记录")
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:create')")
    public CommonResult<Long> createBehaviorRecords(@Valid @RequestBody BehaviorRecordsSaveReqVO createReqVO) {
        return success(behaviorRecordsService.createBehaviorRecords(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新行为记录")
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:update')")
    public CommonResult<Boolean> updateBehaviorRecords(@Valid @RequestBody BehaviorRecordsSaveReqVO updateReqVO) {
        behaviorRecordsService.updateBehaviorRecords(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除行为记录")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:delete')")
    public CommonResult<Boolean> deleteBehaviorRecords(@RequestParam("id") Long id) {
        behaviorRecordsService.deleteBehaviorRecords(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除行为记录")
                @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:delete')")
    public CommonResult<Boolean> deleteBehaviorRecordsList(@RequestParam("ids") List<Long> ids) {
        behaviorRecordsService.deleteBehaviorRecordsListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得行为记录")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:query')")
    public CommonResult<BehaviorRecordsRespVO> getBehaviorRecords(@RequestParam("id") Long id) {
        BehaviorRecordsDO behaviorRecords = behaviorRecordsService.getBehaviorRecords(id);
        BehaviorRecordsRespVO ret = BeanUtils.toBean(behaviorRecords, BehaviorRecordsRespVO.class);
        ret.setImagePath(Lists.newArrayList(behaviorRecords.getImagePath().split(";")));
        return success(ret);
    }

    @GetMapping("/page")
    @Operation(summary = "获得行为记录分页")
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:query')")
    public CommonResult<PageResult<BehaviorRecordsRespVO>> getBehaviorRecordsPage(@Valid BehaviorRecordsPageReqVO pageReqVO) {
        PageResult<BehaviorRecordsDO> pageResult = behaviorRecordsService.getBehaviorRecordsPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, BehaviorRecordsRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出行为记录 Excel")
    @PreAuthorize("@ss.hasPermission('yideyifeng:behavior-records:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportBehaviorRecordsExcel(@Valid BehaviorRecordsPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<BehaviorRecordsDO> list = behaviorRecordsService.getBehaviorRecordsPage(pageReqVO).getList();

        // 1. 单个员工填写
        MedicalEthicsData data = MedicalEthicsData.createSampleData("张三");

        System.out.println("员工信息：" + data.toString());

        String templatePath = "医德档案考评表.xlsx";
        templatePath = resource.getFile().getAbsolutePath();
        System.out.println("资源是否存在: " + templatePath);

        String outputPath = "医德档案考评表_张三.xlsx";

        MedicalEthicsData.fillSingleEmployee(response,templatePath, outputPath, data);
        System.out.println("单个员工文件已生成：" + outputPath);
//        // 导出 Excel
//        ExcelUtils.write(response, "行为记录.xls", "数据", BehaviorRecordsRespVO.class,
//                        BeanUtils.toBean(list, BehaviorRecordsRespVO.class));
    }

}