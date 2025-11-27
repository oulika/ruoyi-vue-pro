package cn.iocoder.yudao.module.yideyifeng.service.scorestaff;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scorestaff.ScoreStaffDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.yideyifeng.dal.mysql.scorestaff.ScoreStaffMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.yideyifeng.enums.ErrorCodeConstants.*;

/**
 * 员工信息 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ScoreStaffServiceImpl implements ScoreStaffService {

    @Resource
    private ScoreStaffMapper scoreStaffMapper;

    @Override
    public Long createScoreStaff(ScoreStaffSaveReqVO createReqVO) {
        // 插入
        ScoreStaffDO scoreStaff = BeanUtils.toBean(createReqVO, ScoreStaffDO.class);
        scoreStaffMapper.insert(scoreStaff);

        // 返回
        return scoreStaff.getId();
    }

    @Override
    public void updateScoreStaff(ScoreStaffSaveReqVO updateReqVO) {
        // 校验存在
        validateScoreStaffExists(updateReqVO.getId());
        // 更新
        ScoreStaffDO updateObj = BeanUtils.toBean(updateReqVO, ScoreStaffDO.class);
        scoreStaffMapper.updateById(updateObj);
    }

    @Override
    public void deleteScoreStaff(Long id) {
        // 校验存在
        validateScoreStaffExists(id);
        // 删除
        scoreStaffMapper.deleteById(id);
    }

    @Override
        public void deleteScoreStaffListByIds(List<Long> ids) {
        // 删除
        scoreStaffMapper.deleteByIds(ids);
        }


    private void validateScoreStaffExists(Long id) {
        if (scoreStaffMapper.selectById(id) == null) {
            throw exception(SCORE_STAFF_NOT_EXISTS);
        }
    }

    @Override
    public ScoreStaffDO getScoreStaff(Long id) {
        return scoreStaffMapper.selectById(id);
    }

    @Override
    public PageResult<ScoreStaffDO> getScoreStaffPage(ScoreStaffPageReqVO pageReqVO) {
        return scoreStaffMapper.selectPage(pageReqVO);
    }

}