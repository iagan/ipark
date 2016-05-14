package org.ithinking.park.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 车辆信息实体
 *
 * @author agan
 * @date 2016-05-14
 */
public class Car implements Serializable {
    // 实体标识
    private Long carId;
    // 车主ID
    private Long ownerId;
    // 车主姓名(冗余字段)
    private String  ownerName;
    // 车牌号码
    private String carNo;
    // 车辆品牌
    private String brand;
    // 车辆颜色
    private String color;
    // 记录版本号
    private Integer version;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;
}
