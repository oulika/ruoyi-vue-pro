package cn.iocoder.yudao.module.yideyifeng.dal.mysql.behaviorrecords;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.behaviorrecords.BehaviorRecordsDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo.*;

/**
 * 行为记录 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface BehaviorRecordsMapper extends BaseMapperX<BehaviorRecordsDO> {

    default PageResult<BehaviorRecordsDO> selectPage(BehaviorRecordsPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BehaviorRecordsDO>()
                .eqIfPresent(BehaviorRecordsDO::getStaffId, reqVO.getStaffId())
                .eqIfPresent(BehaviorRecordsDO::getQuarter, reqVO.getQuarter())
                .eqIfPresent(BehaviorRecordsDO::getCategory, reqVO.getCategory())
                .eqIfPresent(BehaviorRecordsDO::getItem, reqVO.getItem())
                .eqIfPresent(BehaviorRecordsDO::getPoints, reqVO.getPoints())
                .eqIfPresent(BehaviorRecordsDO::getRemark, reqVO.getRemark())
                .eqIfPresent(BehaviorRecordsDO::getDepartment, reqVO.getDepartment())
                .eqIfPresent(BehaviorRecordsDO::getImagePath, reqVO.getImagePath())
                .betweenIfPresent(BehaviorRecordsDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BehaviorRecordsDO::getId));
    }

}