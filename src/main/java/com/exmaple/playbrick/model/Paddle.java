package com.exmaple.playbrick.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Paddle extends BaseModel {
    public Paddle(int width, int height, int positionX, int positionY) {
        super(width, height, positionX, positionY);
    }
}
