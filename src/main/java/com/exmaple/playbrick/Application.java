package com.exmaple.playbrick;

import com.exmaple.playbrick.config.spring.BeanConfig;
import com.exmaple.playbrick.config.spring.InitializationConfig;
import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.window.JFrameWindow;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:47
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(InitializationConfig.class);
        applicationContext.register(BeanConfig.class);
        applicationContext.refresh();

        EventQueue.invokeLater(() -> {
            JFrameWindow frame = applicationContext.getBean(JFrameWindow.class);
            frame.setInit();
            frame.setTitle("打砖块");

        });
        BallService ballService = applicationContext.getBean(BallService.class);
        ballService.f();
    }


}
