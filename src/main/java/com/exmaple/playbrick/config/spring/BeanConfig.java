package com.exmaple.playbrick.config.spring;

import com.exmaple.playbrick.annotation.Value;
import com.exmaple.playbrick.model.Ball;
import com.exmaple.playbrick.model.Paddle;
import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;
import com.exmaple.playbrick.service.impl.BallServiceImpl;
import com.exmaple.playbrick.service.impl.PaddleServiceImpl;
import com.exmaple.playbrick.thread.action.CollisionThread;
import com.exmaple.playbrick.window.JFrameWindow;
import com.exmaple.playbrick.window.component.JPanelWindow;
import com.exmaple.playbrick.window.event.EventKeyListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author jihongyuan
 * @date 2020/1/11 23:22
 */

@Configuration
public class BeanConfig {

    @Value("ball.width")
    private Integer ballWidth;
    @Value("ball.height")
    private Integer ballHeight;
    @Value("ball.positionX")
    private Integer ballPositionX;
    @Value("ball.positionY")
    private Integer ballPositionY;
    @Value("ball.speedX")
    private Integer ballSpeedX;
    @Value("ball.speedY")
    private Integer ballSpeedY;

    @Bean
    public Ball ball() {
        return new Ball(ballWidth, ballHeight, ballPositionX, ballPositionY, ballSpeedX, ballSpeedY);
    }

    @Value("paddle.width")
    private Integer paddleWidth;
    @Value("paddle.height")
    private Integer paddleHeight;
    @Value("paddle.positionX")
    private Integer paddlePositionX;
    @Value("paddle.positionY")
    private Integer paddlePositionY;
    @Value("paddle.speed")
    private Integer paddleSpeed;

    @Bean
    public Paddle paddle() {
        return new Paddle(paddleWidth, paddleHeight, paddlePositionX, paddlePositionY, paddleSpeed);
    }

    @Bean
    public BallService ballService() {
        return new BallServiceImpl();
    }

    @Bean
    public PaddleService paddleService() {
        return new PaddleServiceImpl();
    }

    @Bean
    public EventKeyListener eventKeyListener() {
        return new EventKeyListener();
    }

    @Value("window.width")
    private Integer windowWidth;
    @Value("window.height")
    private Integer windowHeight;

    @Bean
    public JFrameWindow jFrameWindow() {
        return new JFrameWindow(windowWidth, windowHeight);
    }

    @Bean
    public JPanelWindow jPanelWindow() {
        return new JPanelWindow();
    }

    @Bean
    public CollisionThread collisionThread() {
        return new CollisionThread();
    }
}