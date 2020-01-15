package com.exmaple.playbrick.model;


import com.exmaple.playbrick.annotation.Value;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jihongyuan
 * @date 2020/1/9 0:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Ball extends BaseModel {

    private Integer speedX = 5;
    private Integer speedY = 5;
    private Boolean fired = false;

    public Ball(Integer width, Integer height, Integer positionX, Integer positionY) {
        super(width, height, positionX, positionY);
    }

}