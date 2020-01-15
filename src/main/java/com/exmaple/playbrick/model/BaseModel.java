package com.exmaple.playbrick.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:46
 */
@Data
@AllArgsConstructor
public class BaseModel {
    private final int width;
    private final int height;
    private int positionX;
    private int positionY;
}
