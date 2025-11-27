package cn.iocoder.yudao.module.yideyifeng.dal.dataobject.behaviorrecords;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 行为记录 DO
 *
 * @author 芋道源码
 */
@TableName("yideyifeng_behavior_records")
@KeySequence("yideyifeng_behavior_records_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BehaviorRecordsDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 员工ID
     */
    private Integer staffId;
    /**
     * 季度
     */
    private Integer quarter;
    /**
     * 分类
     */
    private String category;
    /**
     * 条目
     */
    private String item;
    /**
     * 分值
     */
    private Double points;
    /**
     * 备注
     */
    private String remark;
    /**
     * 评审科室
     */
    private String department;
    /**
     * 图片路径
     */
    private String imagePath;


}