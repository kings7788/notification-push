package th.co.pchome.noti_j.enums;

import lombok.Getter;

/**
 * 推播通知發送對象 Enum
 */
public enum PushNotiTargetEnum {

    ALL("all", "All"), SPECIFIC("specific", "指定會員");

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
    private PushNotiTargetEnum(String value, String label) {
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
        for(PushNotiTargetEnum targetEnum: PushNotiTargetEnum.values()) {
            if(targetEnum.getValue().equals(value)) {
                return targetEnum.getLabel();
            }
        }
        return "";
    }
}
