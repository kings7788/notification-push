package th.co.pchome.noti_j.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity- 推播通知資料
 */
@Data
@Entity
@Table(name = "NOTI_PUSH")
public class PushNotification {

    /**
     * push ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "PUSH_ID", unique = true, nullable = false)
    private Long pushId;

    /**
     * 發送平台
     */
    @Column(name = "PLATFORM")
    private String platform;

    /**
     * 通知類型
     */
    @Column(name = "NOTI_TYPE")
    private String notiType;

    /**
     * 發送對象
     */
    @Column(name = "TARGET")
    private String target;

    /**
     * 指定會員帳號
     */
    @Column(name = "RECIPIENT")
    private String recipient;

    /**
     * 發送時間
     */
    @Column(name = "SEND_DATE")
    private Date sendDate;

    /**
     * 標題 thailand
     */
    @Column(name = "TH_TITLE")
    private String thTitle;

    /**
     * 內容 thailand
     */
    @Column(name = "TH_CONTENT")
    private String thContent;

    /**
     * 標題 english
     */
    @Column(name = "EN_TITLE")
    private String enTitle;

    /**
     * 內容 english
     */
    @Column(name = "EN_CONTENT")
    private String enContent;

    /**
     * 標題 taiwan
     */
    @Column(name = "TW_TITLE")
    private String twTitle;

    /**
     * 內容 taiwan
     */
    @Column(name = "TW_CONTENT")
    private String twContent;

    /**
     * 連結
     */
    @Column(name = "LINK")
    private String link;

    /**
     * 建立時間
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 建立時間
     */
    @Column(name = "CREATE_DATE", nullable = false, columnDefinition = "TIMESTAMP")
    private Date createDate;

    /**
     * 建立者
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 最後更新時間
     */
    @Column(name = "MODIFIED_DATE", columnDefinition = "TIMESTAMP")
    private Date modifiedDate;

    /**
     * 最後更新者
     */
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
}
