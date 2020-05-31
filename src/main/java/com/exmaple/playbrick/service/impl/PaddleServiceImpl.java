package com.exmaple.playbrick.service.impl;

import com.exmaple.playbrick.enums.PaddleMoveStatusEnum;
import com.exmaple.playbrick.model.Paddle;
import com.exmaple.playbrick.service.PaddleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:31
 */
@Service
public class PaddleServiceImpl extends ServiceImpl implements PaddleService {
    @Resource
    private Paddle paddle;

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(paddle.getPositionX(), paddle.getPositionY(), paddle.getWidth(), paddle.getHeight());
    }

    @Override
    public void setStop() {
        paddle.setMoveStatus(PaddleMoveStatusEnum.STOP.getValue());
    }

    @Override
    public void setMoveLeft() {
        paddle.setMoveStatus(PaddleMoveStatusEnum.MOVE_LEFT.getValue());
    }

    @Override
    public void setMoveRight() {
        paddle.setMoveStatus(PaddleMoveStatusEnum.MOVE_RIGHT.getValue());
    }

    @Override
    public void move() {
        Integer status = paddle.getMoveStatus();

        if (PaddleMoveStatusEnum.MOVE_LEFT.getValue().equals(status) && paddle.getPositionX() > 0) {
            paddle.setPositionX(paddle.getPositionX() - paddle.getSpeed());
        } else if (PaddleMoveStatusEnum.MOVE_RIGHT.getValue().equals(status) && paddle.getPositionX() + paddle.getWidth() < width) {
            paddle.setPositionX(paddle.getPositionX() + paddle.getSpeed());
        }
    }
}
