package th.co.pchome.noti_j.enums;

import lombok.Getter;

/**
 * 推播通知發送平台 Enum
 */
public enum PushNotiPlatformEnum {

    ALL("all", "All"), iOS("ios", "iOS"), Android("android", "Android");

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
    private PushNotiPlatformEnum(String value, String label) {
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
        for(PushNotiPlatformEnum platformEnum: PushNotiPlatformEnum.values()) {
            if(platformEnum.getValue().equals(value)) {
                return platformEnum.getLabel();
            }
        }
        return "";
    }
}
