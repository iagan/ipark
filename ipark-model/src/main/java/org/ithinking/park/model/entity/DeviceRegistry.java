package org.ithinking.park.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 设备注册登记表
 *
 * @author agan
 * @date 2016-05-14
 */
@Entity
@Table(name = "t_device_registry")
public class DeviceRegistry implements Serializable{
    // 实体主键
    private Long id;
    // 域
    private String domain;
    // 读卡器的ID号
    private String cardReaderId;
    // 设备类型
    private String deviceType;
    // 连接状态
    private String connState;
    // 上次活跃时间
    private Date lastActiveTime;
    // 创建时间
    private Date createTime;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Column(name = "card_reader_id")
    public String getCardReaderId() {
        return cardReaderId;
    }

    public void setCardReaderId(String cardReaderId) {
        this.cardReaderId = cardReaderId;
    }

    @Column(name = "device_type")
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Column(name = "conn_state")
    public String getConnState() {
        return connState;
    }

    public void setConnState(String connState) {
        this.connState = connState;
    }

    @Column(name = "last_active_time")
    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
