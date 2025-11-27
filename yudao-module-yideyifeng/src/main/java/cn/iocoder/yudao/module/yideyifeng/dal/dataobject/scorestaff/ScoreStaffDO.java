package cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scorestaff;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 员工信息 DO
 *
 * @author 芋道源码
 */
@TableName("yideyifeng_score_staff")
@KeySequence("yideyifeng_score_staff_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreStaffDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 职务
     */
    private String jobNumber;
    /**
     * 部门
     */
    private String department;
    /**
     * 职称
     */
    private String title;


}