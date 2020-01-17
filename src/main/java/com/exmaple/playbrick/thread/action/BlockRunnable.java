package com.exmaple.playbrick.thread.action;

import com.exmaple.playbrick.model.Block;

/**
 * @author jihongyuan
 * @date 2020/1/17 0:26
 */
public class BlockRunnable implements Runnable {
    private Block block;

    public BlockRunnable(Block block) {
        this.block = block;
    }

    @Override
    public void run() {

    }
}
