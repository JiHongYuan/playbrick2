package com.exmaple.playbrick.thread.action;

import com.exmaple.playbrick.model.Ball;
import com.exmaple.playbrick.model.Paddle;
import com.exmaple.playbrick.service.BallService;

import javax.annotation.Resource;

/**
 * @author jihongyuan
 * @date 2020/1/19 0:40
 */
public class CollisionThread implements Runnable {
    @Resource
    private Ball ball;
    @Resource
    private Paddle paddle;
    @Resource
    private BallService ballService;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double closestPointX = ball.getPositionX();
            double closestPointY = ball.getPositionY();

            if (ball.getPositionX() < paddle.getPositionX()) {
                closestPointX = paddle.getPositionX();
            } else if (ball.getPositionX() > paddle.getPositionX() + paddle.getWidth()) {
                closestPointX = paddle.getPositionX() + paddle.getWidth();
            }

            if (ball.getPositionY() < paddle.getPositionY()) {
                closestPointY = paddle.getPositionY();
            } else if (ball.getPositionY() > paddle.getPositionY() + paddle.getHeight()) {
                closestPointY = paddle.getPositionY() + paddle.getHeight();
            }

            double distance = Math.sqrt(Math.pow(closestPointX - ball.getPositionX(), 2) + Math.pow(closestPointY - ball.getPositionY(), 2));
            if (distance < ball.getWidth()) {
                ballService.rebound();
            }
        }
    }
}
