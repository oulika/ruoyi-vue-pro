package cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff;

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

import cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scorestaff.ScoreStaffDO;
import cn.iocoder.yudao.module.yideyifeng.service.scorestaff.ScoreStaffService;

@Tag(name = "管理后台 - 员工信息")
@RestController
@RequestMapping("/yideyifeng/score-staff")
@Validated
public class ScoreStaffController {

    @Resource
    private ScoreStaffService scoreStaffService;

    @PostMapping("/create")
    @Operation(summary = "创建员工信息")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:create')")
    public CommonResult<Long> createScoreStaff(@Valid @RequestBody ScoreStaffSaveReqVO createReqVO) {
        return success(scoreStaffService.createScoreStaff(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新员工信息")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:update')")
    public CommonResult<Boolean> updateScoreStaff(@Valid @RequestBody ScoreStaffSaveReqVO updateReqVO) {
        scoreStaffService.updateScoreStaff(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除员工信息")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:delete')")
    public CommonResult<Boolean> deleteScoreStaff(@RequestParam("id") Long id) {
        scoreStaffService.deleteScoreStaff(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除员工信息")
                @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:delete')")
    public CommonResult<Boolean> deleteScoreStaffList(@RequestParam("ids") List<Long> ids) {
        scoreStaffService.deleteScoreStaffListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得员工信息")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:query')")
    public CommonResult<ScoreStaffRespVO> getScoreStaff(@RequestParam("id") Long id) {
        ScoreStaffDO scoreStaff = scoreStaffService.getScoreStaff(id);
        return success(BeanUtils.toBean(scoreStaff, ScoreStaffRespVO.class));
    }

    @GetMapping("/getAll")
    @Operation(summary = "获得所有员工信息")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:query')")
    public CommonResult<List<ScoreStaffRespVO>> getAllScoreStaff(@RequestParam("id") Long id) {
        List<ScoreStaffDO> scoreStaff = scoreStaffService.getAllScoreStaff();
        return success(BeanUtils.toBean(scoreStaff, ScoreStaffRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得员工信息分页")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:query')")
    public CommonResult<PageResult<ScoreStaffRespVO>> getScoreStaffPage(@Valid ScoreStaffPageReqVO pageReqVO) {
        PageResult<ScoreStaffDO> pageResult = scoreStaffService.getScoreStaffPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ScoreStaffRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出员工信息 Excel")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-staff:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportScoreStaffExcel(@Valid ScoreStaffPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ScoreStaffDO> list = scoreStaffService.getScoreStaffPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "员工信息.xls", "数据", ScoreStaffRespVO.class,
                        BeanUtils.toBean(list, ScoreStaffRespVO.class));
    }

}