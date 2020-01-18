package com.exmaple.playbrick.service.impl;

import com.exmaple.playbrick.service.IService;

import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/18 7:27
 */
public class ServiceImpl implements IService {
    /**
     * 组件宽度
     * */
    protected int width;

    /**
     * 组件高度
     * */
    protected int height;

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void move() {

    }

    @Override
    public void setComponentSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
