package th.co.pchome.noti_j.vo;

import lombok.Data;

/**
 * Value object- 推播通知 token
 */
@Data
public class PushTokenVo {

    /**
     * 平台
     */
    private String platform;

    /**
     * push token
     */
    private String token;
}
