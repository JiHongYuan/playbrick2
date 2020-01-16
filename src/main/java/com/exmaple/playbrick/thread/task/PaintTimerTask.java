package com.exmaple.playbrick.thread.task;

import com.exmaple.playbrick.window.component.JPanelWindow;

import java.util.TimerTask;

/**
 * @author jihongyuan
 * @date 2020/1/17 0:01
 */
public class PaintTimerTask extends TimerTask {
    private JPanelWindow jPanelWindow;

    public PaintTimerTask(JPanelWindow jPanelWindow) {
        this.jPanelWindow = jPanelWindow;
    }

    @Override
    public void run() {
        jPanelWindow.repaint();
    }
}
