package com.exmaple.playbrick.model;

import com.exmaple.playbrick.enums.PaddleMoveStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:49
 */
public class Paddle extends BaseModel {
    private Integer speed;
    private Integer moveStatus = PaddleMoveStatusEnum.STOP.getValue();

    public Paddle(int width, int height, int positionX, int positionY, Integer speed) {
        super(width, height, positionX, positionY);
        this.speed = speed;
    }

    public synchronized Integer getSpeed() {
        return speed;
    }

    public synchronized void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public synchronized Integer getMoveStatus() {
        return moveStatus;
    }

    public synchronized void setMoveStatus(Integer moveStatus) {
        this.moveStatus = moveStatus;
    }
}
