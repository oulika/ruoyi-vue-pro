package cn.iocoder.yudao.module.yideyifeng.service.scoretemplate;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scoretemplate.ScoreTemplateDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.yideyifeng.dal.mysql.scoretemplate.ScoreTemplateMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.yideyifeng.enums.ErrorCodeConstants.*;

/**
 * 评分标准 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ScoreTemplateServiceImpl implements ScoreTemplateService {

    @Resource
    private ScoreTemplateMapper scoreTemplateMapper;

    @Override
    public Long createScoreTemplate(ScoreTemplateSaveReqVO createReqVO) {
        // 插入
        ScoreTemplateDO scoreTemplate = BeanUtils.toBean(createReqVO, ScoreTemplateDO.class);
        scoreTemplateMapper.insert(scoreTemplate);

        // 返回
        return scoreTemplate.getId();
    }

    @Override
    public void updateScoreTemplate(ScoreTemplateSaveReqVO updateReqVO) {
        // 校验存在
        validateScoreTemplateExists(updateReqVO.getId());
        // 更新
        ScoreTemplateDO updateObj = BeanUtils.toBean(updateReqVO, ScoreTemplateDO.class);
        scoreTemplateMapper.updateById(updateObj);
    }

    @Override
    public void deleteScoreTemplate(Long id) {
        // 校验存在
        validateScoreTemplateExists(id);
        // 删除
        scoreTemplateMapper.deleteById(id);
    }

    @Override
        public void deleteScoreTemplateListByIds(List<Long> ids) {
        // 删除
        scoreTemplateMapper.deleteByIds(ids);
        }


    private void validateScoreTemplateExists(Long id) {
        if (scoreTemplateMapper.selectById(id) == null) {
            throw exception(SCORE_TEMPLATE_NOT_EXISTS);
        }
    }

    @Override
    public ScoreTemplateDO getScoreTemplate(Long id) {
        return scoreTemplateMapper.selectById(id);
    }

    @Override
    public List<ScoreTemplateDO> getAllScoreTemplate() {
        return scoreTemplateMapper.selectList();
    }

    @Override
    public PageResult<ScoreTemplateDO> getScoreTemplatePage(ScoreTemplatePageReqVO pageReqVO) {
        return scoreTemplateMapper.selectPage(pageReqVO);
    }

}