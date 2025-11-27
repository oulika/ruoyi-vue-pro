package cn.iocoder.yudao.module.yideyifeng.dal.mysql.scorestaff;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scorestaff.ScoreStaffDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo.*;

/**
 * 员工信息 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface ScoreStaffMapper extends BaseMapperX<ScoreStaffDO> {

    default PageResult<ScoreStaffDO> selectPage(ScoreStaffPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ScoreStaffDO>()
                .likeIfPresent(ScoreStaffDO::getName, reqVO.getName())
                .eqIfPresent(ScoreStaffDO::getJobNumber, reqVO.getJobNumber())
                .eqIfPresent(ScoreStaffDO::getDepartment, reqVO.getDepartment())
                .eqIfPresent(ScoreStaffDO::getTitle, reqVO.getTitle())
                .betweenIfPresent(ScoreStaffDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ScoreStaffDO::getId));
    }

}