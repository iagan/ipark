package org.ithinking.park.model.entity;

import java.time.LocalDate;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-14
 */
public class CardInfo {
    private Long id;
    // 域
    private String domain;
    // 卡片编号
    private String cardNo;
    // 卡片内码
    private String cardCode;
    // 卡片类型
    private String cardType;
    // 超级权限码
    private String superPermCode;
    // 收费金额
    private Long feeAmount;
    // 截止日期
    private LocalDate expiryDate;
    // 发卡时间
    private LocalDate cardFromDate;
    // 卡片状态（正常，挂失，解挂）
    private String cardState;
    // 操作员
    private String operator;
    // 备注
    private String remark;

    // 允许进入的车场
    private String allowCarYard;

    // 车位
    private String carParkPlaceNo;

    // 车辆ID
    private Long carId;
    // 车主ID
    private Long carOwnerId;
    // 车主名称(冗余)
    private String carOwnerName;

}
