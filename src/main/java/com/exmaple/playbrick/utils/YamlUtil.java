package com.exmaple.playbrick.utils;

import com.exmaple.playbrick.Application;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 配置处理工具类
 *
 * @author jiHongYuan
 */
public class YamlUtil {
    private static LinkedHashMap<String, Object> configurationMap;

    static {
        try {
            Yaml yaml = new Yaml();
            InputStream is = Application.class.getClassLoader().getResourceAsStream("application.yml");
            configurationMap = yaml.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getProperty(String qualifiedKey) {
        return getProperty(configurationMap, qualifiedKey);
    }

    @SuppressWarnings("unchecked")
    private static Object getProperty(Map<String, Object> map, String qualifiedKey) {
        if (!"".equals(qualifiedKey)) {
            if (qualifiedKey.contains(".")) {
                int index = qualifiedKey.indexOf(".");
                String left = qualifiedKey.substring(0, index);
                String right = qualifiedKey.substring(index + 1, qualifiedKey.length());
                return getProperty((Map<String, Object>) map.get(left), right);
            }
            return map.getOrDefault(qualifiedKey, null);
        }
        return null;
    }
}