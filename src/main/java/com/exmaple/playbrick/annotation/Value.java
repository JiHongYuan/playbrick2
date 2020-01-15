package com.exmaple.playbrick.annotation;

import java.lang.annotation.*;

/**
 * @author jihongyuan
 * @date 2020/1/12 11:12
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {
    /** {code} */
    String value();
}
