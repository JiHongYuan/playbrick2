package com.exmaple.playbrick.thread.task;

import com.exmaple.playbrick.service.PaddleService;
import com.exmaple.playbrick.window.component.JPanelWindow;

import java.util.TimerTask;

/**
 * 监听挡板事件和碰撞
 *
 * @author jihongyuan
 * @date 2020/1/17 0:25
 */
public class PaddleTimerTask extends TimerTask {
    private PaddleService paddleService;

    public PaddleTimerTask(PaddleService paddleService) {
        this.paddleService = paddleService;
    }

    @Override
    public void run() {
        paddleService.move();
    }
}
