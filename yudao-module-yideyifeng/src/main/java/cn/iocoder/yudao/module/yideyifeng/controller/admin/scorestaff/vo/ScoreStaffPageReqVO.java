package cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 员工信息分页 Request VO")
@Data
public class ScoreStaffPageReqVO extends PageParam {

    @Schema(description = "姓名", example = "芋艿")
    private String name;

    @Schema(description = "职务")
    private String jobNumber;

    @Schema(description = "部门")
    private String department;

    @Schema(description = "职称")
    private String title;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}