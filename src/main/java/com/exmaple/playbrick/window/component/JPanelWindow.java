package com.exmaple.playbrick.window.component;

import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;

import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/16 23:21
 */

public class JPanelWindow extends JPanel {
    @Resource
    private BallService ballService;
    @Resource
    private PaddleService paddleService;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ballService.draw(g);
        paddleService.draw(g);
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        paint(g);
    }
}