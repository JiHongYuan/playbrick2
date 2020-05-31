package com.exmaple.playbrick.config.spring;

import com.exmaple.playbrick.annotation.Value;
import com.exmaple.playbrick.utils.YamlUtil;
import com.exmaple.playbrick.utils.reflect.ReflectUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;

/**
 * @author jihongyuan
 * @date 2020/1/16 0:05
 */
@Configuration
public class InitializationConfig implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        Field[] fields = ReflectUtils.getFields(bean);
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Value.class)) {
                Object value = YamlUtil.getProperty(field.getAnnotation(Value.class).value());
                try {
                    field.set(bean, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
