package com.exmaple.playbrick.window;

import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;
import com.exmaple.playbrick.thread.ThreadFactory;
import com.exmaple.playbrick.window.component.JPanelWindow;
import com.exmaple.playbrick.window.event.EventKeyListener;

import javax.annotation.Resource;
import javax.swing.*;

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
        // 必须先添加jpandel才能获取容器大小
        add(jPanelWindow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        int w = jPanelWindow.getWidth();
        int h = jPanelWindow.getHeight();

        // 设置组件宽高 初始化后才能使用
        ballService.setComponentSize(w, h);
        paddleService.setComponentSize(w, h);

        addKeyListener(eventKeyListener);

        ThreadFactory.createPaintTimerTask(jPanelWindow);
        ThreadFactory.createBallTimerTask(ballService);
        ThreadFactory.createPaddleTimerTask(paddleService);
    }
}