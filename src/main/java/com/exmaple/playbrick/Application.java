package com.exmaple.playbrick;


import com.exmaple.playbrick.window.JFrameWindow;

import java.awt.*;


/**
 * @author jihongyuan
 * @date 2020/1/9 0:47
 */
public class Application {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrameWindow frame = new JFrameWindow();
            frame.setTitle("打砖块");
            frame.setVisible(true);
        });
    }
}
