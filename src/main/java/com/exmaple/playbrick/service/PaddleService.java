package com.exmaple.playbrick.service;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:30
 */
public interface PaddleService extends IService {
    /**
     * 停止 设置状态
     */
    void setStop();

    /**
     * 左移 设置状态
     */
    void setMoveLeft();

    /**
     * 右移 设置状态
     */
    void setMoveRight();

}