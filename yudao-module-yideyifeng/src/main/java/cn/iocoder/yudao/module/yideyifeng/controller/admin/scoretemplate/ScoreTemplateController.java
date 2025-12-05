package cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate;

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

import cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scoretemplate.ScoreTemplateDO;
import cn.iocoder.yudao.module.yideyifeng.service.scoretemplate.ScoreTemplateService;

@Tag(name = "管理后台 - 评分标准")
@RestController
@RequestMapping("/yideyifeng/score-template")
@Validated
public class ScoreTemplateController {

    @Resource
    private ScoreTemplateService scoreTemplateService;

    @PostMapping("/create")
    @Operation(summary = "创建评分标准")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:create')")
    public CommonResult<Long> createScoreTemplate(@Valid @RequestBody ScoreTemplateSaveReqVO createReqVO) {
        return success(scoreTemplateService.createScoreTemplate(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新评分标准")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:update')")
    public CommonResult<Boolean> updateScoreTemplate(@Valid @RequestBody ScoreTemplateSaveReqVO updateReqVO) {
        scoreTemplateService.updateScoreTemplate(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除评分标准")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:delete')")
    public CommonResult<Boolean> deleteScoreTemplate(@RequestParam("id") Long id) {
        scoreTemplateService.deleteScoreTemplate(id);
        return success(true);
    }

    @DeleteMapping("/delete-list")
    @Parameter(name = "ids", description = "编号", required = true)
    @Operation(summary = "批量删除评分标准")
                @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:delete')")
    public CommonResult<Boolean> deleteScoreTemplateList(@RequestParam("ids") List<Long> ids) {
        scoreTemplateService.deleteScoreTemplateListByIds(ids);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得评分标准")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:query')")
    public CommonResult<ScoreTemplateRespVO> getScoreTemplate(@RequestParam("id") Long id) {
        ScoreTemplateDO scoreTemplate = scoreTemplateService.getScoreTemplate(id);
        return success(BeanUtils.toBean(scoreTemplate, ScoreTemplateRespVO.class));
    }

    @GetMapping("/getAll")
    @Operation(summary = "获得所有评分标准")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:query')")
    public CommonResult<List<ScoreTemplateRespVO>> getAllScoreTemplate() {
        List<ScoreTemplateDO> scoreTemplate = scoreTemplateService.getAllScoreTemplate();
        return success(BeanUtils.toBean(scoreTemplate, ScoreTemplateRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得评分标准分页")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:query')")
    public CommonResult<PageResult<ScoreTemplateRespVO>> getScoreTemplatePage(@Valid ScoreTemplatePageReqVO pageReqVO) {
        PageResult<ScoreTemplateDO> pageResult = scoreTemplateService.getScoreTemplatePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ScoreTemplateRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出评分标准 Excel")
    @PreAuthorize("@ss.hasPermission('yideyifeng:score-template:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportScoreTemplateExcel(@Valid ScoreTemplatePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ScoreTemplateDO> list = scoreTemplateService.getScoreTemplatePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "评分标准.xls", "数据", ScoreTemplateRespVO.class,
                        BeanUtils.toBean(list, ScoreTemplateRespVO.class));
    }

}