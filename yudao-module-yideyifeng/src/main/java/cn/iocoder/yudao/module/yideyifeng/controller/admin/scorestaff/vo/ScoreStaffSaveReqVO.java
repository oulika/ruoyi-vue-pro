package cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 员工信息新增/修改 Request VO")
@Data
public class ScoreStaffSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "13361")
    private Long id;

    @Schema(description = "姓名", example = "芋艿")
    private String name;

    @Schema(description = "职务")
    private String jobNumber;

    @Schema(description = "部门")
    private String department;

    @Schema(description = "职称")
    private String title;

}