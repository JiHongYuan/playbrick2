package com.exmaple.playbrick.thread;

import com.exmaple.playbrick.thread.task.PaintTimerTask;
import com.exmaple.playbrick.window.component.JPanelWindow;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jihongyuan
 * @date 2020/1/16 23:46
 */
public class ThreadFactory {
    private static ScheduledExecutorService scheduledExecutorService;

    static {
        scheduledExecutorService = Executors.newScheduledThreadPool(2);
    }

    public static void createPaintTimerTask(JPanelWindow jPanelWindow) {
        // 初始化延迟0ms开始执行，每隔30ms重新执行一次任务
        scheduledExecutorService.scheduleAtFixedRate(
                new PaintTimerTask(jPanelWindow), 0, 30, TimeUnit.MILLISECONDS);
    }
}
