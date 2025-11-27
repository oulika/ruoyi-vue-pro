package cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 行为记录分页 Request VO")
@Data
public class BehaviorRecordsPageReqVO extends PageParam {

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
    private String imagePath;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}