package com.exmaple.playbrick.model;


/**
 * @author jihongyuan
 * @date 2020/1/9 0:47
 */
public class Ball extends BaseModel {

    private int speedX = 5;
    private int speedY = 5;
    private boolean fired = false;

    public Ball(int width, int height, int positionX, int positionY) {
        super(width, height, positionX, positionY);
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }
}
