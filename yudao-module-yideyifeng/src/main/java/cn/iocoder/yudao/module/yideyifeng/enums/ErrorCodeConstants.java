package cn.iocoder.yudao.module.yideyifeng.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {
    ErrorCode SCORE_STAFF_NOT_EXISTS = new ErrorCode(1001, "员工信息不存在");
    ErrorCode SCORE_TEMPLATE_NOT_EXISTS = new ErrorCode(1002, "评分标准不存在");

    ErrorCode BEHAVIOR_RECORDS_NOT_EXISTS = new ErrorCode(1003, "行为记录不存在");


}
