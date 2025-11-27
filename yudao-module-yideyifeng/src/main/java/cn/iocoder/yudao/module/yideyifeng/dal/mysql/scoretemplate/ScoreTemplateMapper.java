package cn.iocoder.yudao.module.yideyifeng.dal.mysql.scoretemplate;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scoretemplate.ScoreTemplateDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate.vo.*;

/**
 * 评分标准 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface ScoreTemplateMapper extends BaseMapperX<ScoreTemplateDO> {

    default PageResult<ScoreTemplateDO> selectPage(ScoreTemplatePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ScoreTemplateDO>()
                .eqIfPresent(ScoreTemplateDO::getCategory, reqVO.getCategory())
                .eqIfPresent(ScoreTemplateDO::getItem, reqVO.getItem())
                .eqIfPresent(ScoreTemplateDO::getPoints, reqVO.getPoints())
                .eqIfPresent(ScoreTemplateDO::getDepartment, reqVO.getDepartment())
                .betweenIfPresent(ScoreTemplateDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ScoreTemplateDO::getId));
    }

}