package com.exmaple.playbrick.thread.action;

import com.exmaple.playbrick.model.Block;

/**
 * @author jihongyuan
 * @date 2020/1/17 0:26
 */
public class BlockThread extends Thread {
    private Block block;

    public BlockThread(Block block) {
        this.block = block;
    }

    @Override
    public void run() {
        super.run();
    }
}
