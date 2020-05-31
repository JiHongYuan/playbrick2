package com.exmaple.playbrick.model;


import com.exmaple.playbrick.enums.BallMoveStatusEnum;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:47
 */
public class Ball extends BaseModel {
    private Integer speedX;
    private Integer speedY;
    private Integer moveStatus = BallMoveStatusEnum.STOP.getValue();

    public Ball(Integer width, Integer height, Integer positionX, Integer positionY, Integer speedX, Integer speedY) {
        super(width, height, positionX, positionY);
        this.speedX = speedX;
        this.speedY = speedY;
    }


    public synchronized Integer getSpeedX() {
        return speedX;
    }

    public synchronized void setSpeedX(Integer speedX) {
        this.speedX = speedX;
    }

    public synchronized Integer getSpeedY() {
        return speedY;
    }

    public synchronized void setSpeedY(Integer speedY) {
        this.speedY = speedY;
    }

    public synchronized Integer getMoveStatus() {
        return moveStatus;
    }

    public synchronized void setMoveStatus(Integer moveStatus) {
        this.moveStatus = moveStatus;
    }
}