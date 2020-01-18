package com.exmaple.playbrick.enums;

/**
 * @author jihongyuan
 * @date 2020/1/18 21:13
 */
public enum PaddleMoveStatusEnum {
    /**
     * 停止
     */
    STOP(0),

    /**
     * 左移
     */
    MOVE_LEFT(1),

    /**
     * 右移
     */
    MOVE_RIGHT(2),
    ;
    private final Integer value;

    PaddleMoveStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
