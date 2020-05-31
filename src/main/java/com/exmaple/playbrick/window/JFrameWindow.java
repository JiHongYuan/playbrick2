package com.exmaple.playbrick.window;

import com.exmaple.playbrick.Application;
import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;
import com.exmaple.playbrick.thread.ThreadFactory;
import com.exmaple.playbrick.thread.action.CollisionThread;
import com.exmaple.playbrick.window.component.JPanelWindow;
import com.exmaple.playbrick.window.event.EventKeyListener;

import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

/**
 * @author jihongyuan
 */
public class JFrameWindow extends JFrame {
    @Resource
    private EventKeyListener eventKeyListener;
    @Resource
    private JPanelWindow jPanelWindow;
    @Resource
    private BallService ballService;
    @Resource
    private PaddleService paddleService;

    public JFrameWindow(Integer width, Integer height) {
        setSize(width, height);
    }

    public void setInit() {
        this.addKeyListener(eventKeyListener);
        this.add(jPanelWindow);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        int w = jPanelWindow.getWidth();
        int h = jPanelWindow.getHeight();

        // 设置组件宽高 初始化后才能使用
        ballService.setComponentSize(w, h);
        paddleService.setComponentSize(w, h);

        ThreadFactory.createPaintTimerTask(jPanelWindow);
        ThreadFactory.createBallTimerTask(ballService);
        ThreadFactory.createPaddleTimerTask(paddleService);
        ThreadFactory.create(Application.APPLICATION_CONTEXT.getBean(CollisionThread.class));

    }
}