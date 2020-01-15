package com.exmaple.playbrick.service.impl;

import com.exmaple.playbrick.model.Paddle;
import com.exmaple.playbrick.service.PaddleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jihongyuan
 * @date 2020/1/12 9:31
 */
@Service
public class PaddleServiceImpl implements PaddleService {
    @Resource
    private Paddle paddle;
}
