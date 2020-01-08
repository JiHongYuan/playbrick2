package com.exmaple.playbrick.model;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:49
 */
public class Paddle extends BaseModel {
    private static final int PADDLE_WIDTH = 125;
    private static final int PADDLE_HEIGHT = 25;

    public Paddle(int width, int height, int positionX, int positionY) {
        super(width, height, positionX, positionY);
    }
}
