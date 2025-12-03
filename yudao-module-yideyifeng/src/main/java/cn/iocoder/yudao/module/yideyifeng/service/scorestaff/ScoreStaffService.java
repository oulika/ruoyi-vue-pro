package cn.iocoder.yudao.module.yideyifeng.service.scorestaff;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.scorestaff.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.scorestaff.ScoreStaffDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 员工信息 Service 接口
 *
 * @author 芋道源码
 */
public interface ScoreStaffService {

    /**
     * 创建员工信息
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createScoreStaff(@Valid ScoreStaffSaveReqVO createReqVO);

    /**
     * 更新员工信息
     *
     * @param updateReqVO 更新信息
     */
    void updateScoreStaff(@Valid ScoreStaffSaveReqVO updateReqVO);

    /**
     * 删除员工信息
     *
     * @param id 编号
     */
    void deleteScoreStaff(Long id);

    /**
    * 批量删除员工信息
    *
    * @param ids 编号
    */
    void deleteScoreStaffListByIds(List<Long> ids);

    /**
     * 获得员工信息
     *
     * @param id 编号
     * @return 员工信息
     */
    ScoreStaffDO getScoreStaff(Long id);

    /**
     * 获得员工信息分页
     *
     * @param pageReqVO 分页查询
     * @return 员工信息分页
     */
    PageResult<ScoreStaffDO> getScoreStaffPage(ScoreStaffPageReqVO pageReqVO);

    /**
     * 获得所有员工信息
     *
     * @return 员工信息
     */
    List<ScoreStaffDO> getAllScoreStaff();

}