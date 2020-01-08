package com.exmaple.playbrick.window;

import javax.swing.*;
import java.util.Timer;

/**
 * @author jihongyuan
 */
public class JFrameWindow extends JFrame {
    /**
     * DEFAULT_WIDTH 组件宽
     * DEFAULT_HEIGHT 组件高度
     */
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 420;

    public JFrameWindow() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
