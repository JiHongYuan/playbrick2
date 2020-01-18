package com.exmaple.playbrick.thread;

import com.exmaple.playbrick.service.BallService;
import com.exmaple.playbrick.service.PaddleService;
import com.exmaple.playbrick.thread.task.BallTimerTask;
import com.exmaple.playbrick.thread.task.PaddleTimerTask;
import com.exmaple.playbrick.thread.task.PaintTimerTask;
import com.exmaple.playbrick.window.component.JPanelWindow;

import java.util.concurrent.*;

/**
 * @author jihongyuan
 * @date 2020/1/16 23:46
 */
public class ThreadFactory {

    private static final Integer INITIAL_DELAY = 0;
    private static final Integer PERIOD = 30;
    /**
     * 存放UI刷新定时器
     */
    private static ScheduledExecutorService uiScheduledExecutorService;
    private static ScheduledExecutorService actionScheduledExecutorService;

    private static ExecutorService executorService;

    static {
        uiScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        actionScheduledExecutorService = Executors.newScheduledThreadPool(2);
        executorService = Executors.newFixedThreadPool(5);
    }

    public static void createPaintTimerTask(JPanelWindow jPanelWindow) {
        // 初始化延迟0ms开始执行，每隔30ms重新执行一次任务
        uiScheduledExecutorService.scheduleAtFixedRate(
                new PaintTimerTask(jPanelWindow), INITIAL_DELAY, PERIOD, TimeUnit.MILLISECONDS);
    }

    public static void createBallTimerTask(BallService ballService) {
        actionScheduledExecutorService.scheduleAtFixedRate(
                new BallTimerTask(ballService), INITIAL_DELAY, PERIOD / 5, TimeUnit.MILLISECONDS);
    }

    public static void createPaddleTimerTask(PaddleService paddleService) {
        actionScheduledExecutorService.scheduleAtFixedRate(
                new PaddleTimerTask(paddleService), INITIAL_DELAY, PERIOD, TimeUnit.MILLISECONDS);
    }

    public static void create(Runnable runnable) {
        executorService.execute(runnable);
    }
}
