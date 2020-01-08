package com.exmaple.playbrick.model;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:46
 */
public class BaseModel {
    private final int width;
    private final int height;
    private int positionX;
    private int positionY;

    public BaseModel(int width, int height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
