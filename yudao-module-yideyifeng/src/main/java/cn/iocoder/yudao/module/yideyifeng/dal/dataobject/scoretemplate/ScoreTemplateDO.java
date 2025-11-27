package cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scoretemplate;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 评分标准 DO
 *
 * @author 芋道源码
 */
@TableName("yideyifeng_score_template")
@KeySequence("yideyifeng_score_template_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreTemplateDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 分类
     */
    private String category;
    /**
     * 项目
     */
    private String item;
    /**
     * 分值
     */
    private Double points;
    /**
     * 科室
     */
    private String department;


}