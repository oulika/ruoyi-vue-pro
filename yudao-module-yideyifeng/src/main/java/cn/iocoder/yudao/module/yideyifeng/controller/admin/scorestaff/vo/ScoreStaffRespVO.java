package cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.idev.excel.annotation.*;

@Schema(description = "管理后台 - 员工信息 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ScoreStaffRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "13361")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "姓名", example = "芋艿")
    @ExcelProperty("姓名")
    private String name;

    @Schema(description = "职务")
    @ExcelProperty("职务")
    private String jobNumber;

    @Schema(description = "部门")
    @ExcelProperty("部门")
    private String department;

    @Schema(description = "职称")
    @ExcelProperty("职称")
    private String title;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}