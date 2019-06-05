package th.co.pchome.noti_j.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity- 推播通知審核資料
 */
@Data
@Entity
@Table(name = "NOTI_PUSH_REVIEW")
public class PushNotiReview {

    /**
     * review ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID", unique = true, nullable = false)
    private Long reviewId;

    /**
     * push ID
     */
    @Column(name = "PUSH_ID")
    private Long pushId;

    /**
     * 審核結果 (OK / REJECT)
     */
    @Column(name = "RESULT")
    private String result;

    /**
     * 退回原因
     */
    @Column(name = "REJECT_REASON")
    private String rejectReason;

    /**
     * 審核時間
     */
    @Column(name = "REVIEW_DATE")
    private Date reviewDate;

    /**
     * 審核者
     */
    @Column(name = "REVIEW_BY")
    private String reviewBy;
}
