package cn.iocoder.yudao.module.yideyifeng.service.behaviorrecords;

import cn.hutool.core.collection.CollUtil;
import jodd.util.StringUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.behaviorrecords.BehaviorRecordsDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.yideyifeng.dal.mysql.behaviorrecords.BehaviorRecordsMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
import static cn.iocoder.yudao.module.yideyifeng.enums.ErrorCodeConstants.*;

/**
 * 行为记录 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class BehaviorRecordsServiceImpl implements BehaviorRecordsService {

    @Resource
    private BehaviorRecordsMapper behaviorRecordsMapper;

    @Override
    public Long createBehaviorRecords(BehaviorRecordsSaveReqVO createReqVO) {
        // 插入
        BehaviorRecordsDO behaviorRecords = BeanUtils.toBean(createReqVO, BehaviorRecordsDO.class);
        behaviorRecords.setImagePath(StringUtil.join(createReqVO.getImagePath(),";"));
        behaviorRecordsMapper.insert(behaviorRecords);

        // 返回
        return behaviorRecords.getId();
    }

    @Override
    public void updateBehaviorRecords(BehaviorRecordsSaveReqVO updateReqVO) {
        // 校验存在
        validateBehaviorRecordsExists(updateReqVO.getId());
        // 更新
        BehaviorRecordsDO updateObj = BeanUtils.toBean(updateReqVO, BehaviorRecordsDO.class);
        behaviorRecordsMapper.updateById(updateObj);
    }

    @Override
    public void deleteBehaviorRecords(Long id) {
        // 校验存在
        validateBehaviorRecordsExists(id);
        // 删除
        behaviorRecordsMapper.deleteById(id);
    }

    @Override
        public void deleteBehaviorRecordsListByIds(List<Long> ids) {
        // 删除
        behaviorRecordsMapper.deleteByIds(ids);
        }


    private void validateBehaviorRecordsExists(Long id) {
        if (behaviorRecordsMapper.selectById(id) == null) {
            throw exception(BEHAVIOR_RECORDS_NOT_EXISTS);
        }
    }

    @Override
    public BehaviorRecordsDO getBehaviorRecords(Long id) {
        return behaviorRecordsMapper.selectById(id);
    }

    @Override
    public PageResult<BehaviorRecordsDO> getBehaviorRecordsPage(BehaviorRecordsPageReqVO pageReqVO) {
        return behaviorRecordsMapper.selectPage(pageReqVO);
    }

}