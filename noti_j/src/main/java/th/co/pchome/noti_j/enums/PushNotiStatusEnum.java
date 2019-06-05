package th.co.pchome.noti_j.enums;

import lombok.Getter;

/**
 * 推播通知狀態 Enum
 */
public enum PushNotiStatusEnum {

    INIT("INIT", "新增"), REVIEW("REVIEW", "待審核"), OK("OK", "審核通過，待發送"), REJECT("REJECT", "退回，請重新編緝"),
    SENT("SENT", "已發送"), EXPIRED("EXPIRED", "已過期"), DEL("DEL", "已取消"), CANCEL("CANCEL", "審核通過，已取消");

    @Getter
    private String value;

    @Getter
    private String label;

    /**
     * Constructor
     *
     * @param value 值
     * @param label 顯示文案
     */
    private PushNotiStatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * Get label by value
     *
     * @param value 值
     * @return 顯示文案
     */
    public static String getLabel(String value) {
        for(PushNotiStatusEnum statusEnum: PushNotiStatusEnum.values()) {
            if(statusEnum.getValue().equals(value)) {
                return statusEnum.getLabel();
            }
        }
        return "";
    }
}
