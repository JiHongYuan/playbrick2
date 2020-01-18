package com.exmaple.playbrick.service;

import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/16 23:28
 */
public interface IService {

    /**
     * draw
     *
     * @param g Graphics
     */
    void draw(Graphics g);

    /**
     * move
     */
    void move();

    /**
     * 设置组件大小
     *
     * @param width  宽度
     * @param height 高度
     */
    void setComponentSize(int width, int height);
}
