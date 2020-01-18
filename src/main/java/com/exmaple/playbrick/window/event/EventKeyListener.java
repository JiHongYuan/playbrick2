package com.exmaple.playbrick.window.event;

import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author jihongyuan
 * @date 2020/1/10 0:32
 */
public class EventKeyListener implements KeyListener {

    @Resource
    private PaddleService paddleService;
    @Resource
    private BallService ballService;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                paddleService.setMoveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                paddleService.setMoveRight();
                break;
            case KeyEvent.VK_A:
                paddleService.setMoveLeft();
                break;
            case KeyEvent.VK_D:
                paddleService.setMoveRight();
                break;
            case KeyEvent.VK_F:
                ballService.setMove();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                paddleService.setStop();
                break;
            case KeyEvent.VK_RIGHT:
                paddleService.setStop();
                break;
            case KeyEvent.VK_A:
                paddleService.setStop();
                break;
            case KeyEvent.VK_D:
                paddleService.setStop();
                break;
            case KeyEvent.VK_F:
                break;
            case KeyEvent.VK_P:
                ballService.setStop();
                break;
            default:
                break;
        }
    }
}
