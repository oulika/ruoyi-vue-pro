package cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 行为记录新增/修改 Request VO")
@Data
public class BehaviorRecordsSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27659")
    private Long id;

    @Schema(description = "员工ID", example = "8077")
    private Integer staffId;

    @Schema(description = "季度")
    private Integer quarter;

    @Schema(description = "分类")
    private String category;

    @Schema(description = "条目")
    private String item;

    @Schema(description = "分值")
    private Double points;

    @Schema(description = "备注", example = "随便")
    private String remark;

    @Schema(description = "评审科室")
    private String department;

    @Schema(description = "图片路径")
    private List<String> imagePath;

}