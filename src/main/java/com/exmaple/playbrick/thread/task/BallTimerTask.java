package com.exmaple.playbrick.thread.task;

import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.window.component.JPanelWindow;

import java.util.TimerTask;

/**
 * listener ball event
 *
 * @author jihongyuan
 * @date 2020/1/17 0:24
 */
public class BallTimerTask extends TimerTask {
    private BallService ballService;

    public BallTimerTask(BallService ballService) {
        this.ballService = ballService;
    }

    @Override
    public void run() {
        ballService.move();
    }
}
