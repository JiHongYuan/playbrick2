package com.exmaple.playbrick.service;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:28
 */
public interface BallService extends IService {
    /**
     * 移动 设置状态
     */
    void setMove();

    /**
     *  停止 设置状态
     * */
    void setStop();

    /**
     * 反弹
     */
    void rebound();
}
