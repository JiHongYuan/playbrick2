package com.exmaple.playbrick.enums;

/**
 * 球 移动状态
 * @author jihongyuan
 * @date 2020/1/18 21:11
 */
public enum BallMoveStatusEnum {

    /**
     * 停止
     */
    STOP(0),

    /**
     * 移动
     */
    MOVE(1),
    ;
    private final Integer value;

    BallMoveStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}