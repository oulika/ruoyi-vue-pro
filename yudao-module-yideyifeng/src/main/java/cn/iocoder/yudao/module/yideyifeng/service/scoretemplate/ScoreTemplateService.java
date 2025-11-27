package cn.iocoder.yudao.module.yideyifeng.service.scoretemplate;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scoretemplate.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scoretemplate.ScoreTemplateDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 评分标准 Service 接口
 *
 * @author 芋道源码
 */
public interface ScoreTemplateService {

    /**
     * 创建评分标准
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createScoreTemplate(@Valid ScoreTemplateSaveReqVO createReqVO);

    /**
     * 更新评分标准
     *
     * @param updateReqVO 更新信息
     */
    void updateScoreTemplate(@Valid ScoreTemplateSaveReqVO updateReqVO);

    /**
     * 删除评分标准
     *
     * @param id 编号
     */
    void deleteScoreTemplate(Long id);

    /**
    * 批量删除评分标准
    *
    * @param ids 编号
    */
    void deleteScoreTemplateListByIds(List<Long> ids);

    /**
     * 获得评分标准
     *
     * @param id 编号
     * @return 评分标准
     */
    ScoreTemplateDO getScoreTemplate(Long id);

    /**
     * 获得评分标准分页
     *
     * @param pageReqVO 分页查询
     * @return 评分标准分页
     */
    PageResult<ScoreTemplateDO> getScoreTemplatePage(ScoreTemplatePageReqVO pageReqVO);

}