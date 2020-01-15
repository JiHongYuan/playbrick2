package com.exmaple.playbrick.service.impl;

import com.exmaple.playbrick.model.Ball;
import com.exmaple.playbrick.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:29
 */
@Service
public class BallServiceImpl implements BallService {
    @Resource
    private Ball ball;

    @Override
    public void f() {
        System.out.println(ball.getSpeedX());
    }
}
