package th.co.pchome.noti_j.enums;

import lombok.Getter;

/**
 * 推播通知類型 Enum
 */
public enum PushNotiTypeEnum {

    MARKETING("marketing", "行銷活動"), SYSTEM("system", "系統通知");

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
    private PushNotiTypeEnum(String value, String label) {
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
        for(PushNotiTypeEnum typeEnum: PushNotiTypeEnum.values()) {
            if(typeEnum.getValue().equals(value)) {
                return typeEnum.getLabel();
            }
        }
        return "";
    }
}
