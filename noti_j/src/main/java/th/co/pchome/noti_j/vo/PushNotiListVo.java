package th.co.pchome.noti_j.vo;

import lombok.Data;

import java.util.Date;

/**
 * View object- 推播通知列表
 */
@Data
public class PushNotiListVo {

    /**
     * push ID
     */
    private long pushId;

    /**
     * 標題 thailand
     */
    private String thTitle;

    /**
     * 標題 english
     */
    private String enTitle;

    /**
     * 標題 taiwan
     */
    private String twTitle;

    /**
     * 通知類型
     */
    private String notiType;

    /**
     * 發送平台
     */
    private String platform;

    /**
     * 發送對象
     */
    private String target;

    /**
     * 發送時間
     */
    private Date sendDate;

    /**
     * 狀態
     */
    private String status;

    /**
     * iOS發送數/成功/失敗
     */
    private String iosNum;

    /**
     * Android發送數/成功/失敗
     */
    private String androidNum;

    /**
     * 新增者
     */
    private String creator;

    /**
     * 新增時間
     */
    private Date createDate;

    /**
     * 審核者
     */
    private String reviewBy;

    /**
     * 審核時間
     */
    private Date reviewDate;
}
