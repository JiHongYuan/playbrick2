package com.exmaple.playbrick.utils;

import com.exmaple.playbrick.Application;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 配置处理工具类
 *
 * @author jiHongYuan
 */
public class YamlUtil {
    private static final LinkedHashMap<String, Object> configurationMap;

    private YamlUtil() {
    }

    static {
        Yaml yaml = new Yaml();
        InputStream is = Application.class.getClassLoader().getResourceAsStream("application.yml");
        configurationMap = yaml.load(is);
    }

    public static Object getProperty(String qualifiedKey) {
        return getProperty(configurationMap, qualifiedKey);
    }

    @SuppressWarnings("unchecked")
    private static Object getProperty(Map<String, Object> map, String qualifiedKey) {
        if (!"".equals(qualifiedKey)) {
            if (qualifiedKey.contains(".")) {
                int index = qualifiedKey.indexOf('.');
                String left = qualifiedKey.substring(0, index);
                String right = qualifiedKey.substring(index + 1);
                return getProperty((Map<String, Object>) map.get(left), right);
            }
            return map.getOrDefault(qualifiedKey, null);
        }
        return null;
    }
}