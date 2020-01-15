package com.exmaple.playbrick.window.event;

import org.springframework.stereotype.Component;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author jihongyuan
 * @date 2020/1/10 0:32
 */
public class EventKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_A:
                System.out.println("123");
                break;
            case KeyEvent.VK_D:
                break;
            case KeyEvent.VK_F:
                break;
            default:
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
