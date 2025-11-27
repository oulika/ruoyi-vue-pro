package cn.iocoder.yudao.module.yideyifeng.service.behaviorrecords;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo.*;
import cn.iocoder.yudao.module.yideyifeng.dal.dataobject.behaviorrecords.BehaviorRecordsDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 行为记录 Service 接口
 *
 * @author 芋道源码
 */
public interface BehaviorRecordsService {

    /**
     * 创建行为记录
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createBehaviorRecords(@Valid BehaviorRecordsSaveReqVO createReqVO);

    /**
     * 更新行为记录
     *
     * @param updateReqVO 更新信息
     */
    void updateBehaviorRecords(@Valid BehaviorRecordsSaveReqVO updateReqVO);

    /**
     * 删除行为记录
     *
     * @param id 编号
     */
    void deleteBehaviorRecords(Long id);

    /**
    * 批量删除行为记录
    *
    * @param ids 编号
    */
    void deleteBehaviorRecordsListByIds(List<Long> ids);

    /**
     * 获得行为记录
     *
     * @param id 编号
     * @return 行为记录
     */
    BehaviorRecordsDO getBehaviorRecords(Long id);

    /**
     * 获得行为记录分页
     *
     * @param pageReqVO 分页查询
     * @return 行为记录分页
     */
    PageResult<BehaviorRecordsDO> getBehaviorRecordsPage(BehaviorRecordsPageReqVO pageReqVO);

}