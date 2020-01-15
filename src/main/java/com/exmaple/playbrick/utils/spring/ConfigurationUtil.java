package com.exmaple.playbrick.utils.spring;

import com.exmaple.playbrick.Application;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author jihongyuan
 * @date 2020/1/12 11:15
 */
public class ConfigurationUtil {

    private static ConcurrentMap<String, Object> configurationMap;
    private static ConcurrentMap<Class, Object> classObjectMap;

    static {
        try {
            Yaml yaml = new Yaml();
            InputStream is = Application.class.getClassLoader().getResourceAsStream("application.yml");
            configurationMap = yaml.load(is);
            classObjectMap = new ConcurrentHashMap<>();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
