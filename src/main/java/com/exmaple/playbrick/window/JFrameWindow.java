package com.exmaple.playbrick.window;

import com.exmaple.playbrick.window.event.EventKeyListener;

import javax.annotation.Resource;
import javax.swing.*;

/**
 * @author jihongyuan
 */
public class JFrameWindow extends JFrame {
    @Resource
    private EventKeyListener eventKeyListener;

    public JFrameWindow(Integer width, Integer height) {
        setSize(width, height);

    }

    public void setInit() {
        addKeyListener(eventKeyListener);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}