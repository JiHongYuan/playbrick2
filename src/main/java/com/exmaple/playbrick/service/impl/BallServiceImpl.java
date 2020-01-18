package com.exmaple.playbrick.service.impl;

import com.exmaple.playbrick.enums.BallMoveStatusEnum;
import com.exmaple.playbrick.model.Ball;
import com.exmaple.playbrick.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:29
 */
@Service
public class BallServiceImpl extends ServiceImpl implements BallService {
    @Resource
    private Ball ball;

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(ball.getPositionX(), ball.getPositionY(), ball.getWidth(), ball.getHeight());
    }

    @Override
    public void move() {
        if (BallMoveStatusEnum.MOVE.getValue().equals((ball.getMoveStatus()))) {
            if (ball.getPositionX() <= 0 || ball.getPositionX() + ball.getWidth() >= width) {
                ball.setSpeedX(ball.getSpeedX() * -1);
            }

            if (ball.getPositionY() <= 0 || ball.getPositionY() + ball.getHeight() >= height) {
                ball.setSpeedY(ball.getSpeedY() * -1);
            }

            ball.setPositionX(ball.getPositionX() + ball.getSpeedX());
            ball.setPositionY(ball.getPositionY() + ball.getSpeedY());
        }

    }

    @Override
    public void setMove() {
        ball.setMoveStatus(BallMoveStatusEnum.MOVE.getValue());
    }

    @Override
    public void setStop() {
        ball.setMoveStatus(BallMoveStatusEnum.STOP.getValue());
    }

    @Override
    public void rebound() {
        ball.setSpeedY(ball.getSpeedY() * -1);
    }
}
