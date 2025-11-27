package cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 评分标准 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ScoreTemplateRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "7869")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "分类")
    @ExcelProperty("分类")
    private String category;

    @Schema(description = "项目")
    @ExcelProperty("项目")
    private String item;

    @Schema(description = "分值")
    @ExcelProperty("分值")
    private Double points;

    @Schema(description = "科室")
    @ExcelProperty("科室")
    private String department;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}