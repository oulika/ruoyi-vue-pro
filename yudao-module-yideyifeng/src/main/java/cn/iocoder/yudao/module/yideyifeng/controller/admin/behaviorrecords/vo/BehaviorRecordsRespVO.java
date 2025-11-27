package cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 行为记录 Response VO")
@Data
@ExcelIgnoreUnannotated
public class BehaviorRecordsRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27659")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "员工ID", example = "8077")
    @ExcelProperty("员工ID")
    private Integer staffId;

    @Schema(description = "季度")
    @ExcelProperty("季度")
    private Integer quarter;

    @Schema(description = "分类")
    @ExcelProperty("分类")
    private String category;

    @Schema(description = "条目")
    @ExcelProperty("条目")
    private String item;

    @Schema(description = "分值")
    @ExcelProperty("分值")
    private Double points;

    @Schema(description = "备注", example = "随便")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "评审科室")
    @ExcelProperty("评审科室")
    private String department;

    @Schema(description = "图片路径")
    @ExcelProperty("图片路径")
    private String imagePath;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}