package org.ithinking.park.model.entity;

/**
 * 读卡器信息
 *
 * @author agan
 * @date 2016-05-14
 */
public class CardReader {
    // 记录主键
    private Long id;
    // 域
    private String domain;
    //读卡器的ID号
    private String cardReaderNo;
    //读卡器机身地址
    private String cardReaderAddress;
    //手机号
    private String mobile;
    //信号强度
    private Integer signalLevel;
    // 帧间隔
    private Integer frameInterval;
    //  反潜回标志
    private String antiBackFlag;
    // 车场号
    private String carParkNo;
    // 超级权限码
    private String superPermCode;
    // 休眠卡的时间
    private String cardSleepTime;
    //播报车牌标志
    private Boolean enable;
    //语音播报阀值

    //出入口
    //音量
    //地感功能
    //RS485方式
    //韦根
    //继电器功能
    //韦根周期
    //韦根宽度
    //车牌检测模式
    //车牌允许错误个数
    //读卡器安装位置
    //需要常显示的文字
}
