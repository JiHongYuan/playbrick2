package com.exmaple.playbrick.utils.reflect;


import java.lang.reflect.*;

/**
 * 反射工具类
 *
 * @author jihongyuan
 */
public class ReflectUtils {
    private static final String SETTER_PREFIX = "set";

    private static final String GETTER_PREFIX = "get";

    private static final String CGLIB_CLASS_SEPARATOR = "$$";

    public static Field[] getFields(Object obj) {
        if (obj == null) {
            throw new RuntimeException("obj must not be null");
        }
        Class clazz = obj.getClass();
        if (clazz.getName().contains(CGLIB_CLASS_SEPARATOR)) {
            clazz = clazz.getSuperclass();
        }

        return clazz.getDeclaredFields();
    }
}
