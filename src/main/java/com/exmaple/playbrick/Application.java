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
    public static final AnnotationConfigApplicationContext APPLICATION_CONTEXT = new AnnotationConfigApplicationContext();

    public static void main(String[] args) {
        APPLICATION_CONTEXT.register(InitializationConfig.class);
        APPLICATION_CONTEXT.register(BeanConfig.class);
        APPLICATION_CONTEXT.refresh();

        EventQueue.invokeLater(() -> {
            JFrameWindow frame = APPLICATION_CONTEXT.getBean(JFrameWindow.class);
            frame.setInit();
            frame.setTitle("打砖块");

        });
        BallService ballService = APPLICATION_CONTEXT.getBean(BallService.class);
    }


}