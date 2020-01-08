package com.exmaple.playbrick.model;


/**
 * @author jihongyuan
 * @date 2020/1/9 0:48
 */
public class Block extends BaseModel {
    private int positionX = 100;
    private int positionY = 100;
    private int blockHp = 1;
    private boolean blockAlive = true;

    public Block(int width, int height, int positionX, int positionY) {
        super(width, height, positionX, positionY);
    }

    @Override
    public int getPositionX() {
        return positionX;
    }

    @Override
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    @Override
    public int getPositionY() {
        return positionY;
    }

    @Override
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getBlockHp() {
        return blockHp;
    }

    public void setBlockHp(int blockHp) {
        this.blockHp = blockHp;
    }

    public boolean isBlockAlive() {
        return blockAlive;
    }

    public void setBlockAlive(boolean blockAlive) {
        this.blockAlive = blockAlive;
    }
}
