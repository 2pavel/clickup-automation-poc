package com.clickup.commons;

import com.clickup.gui.utils.PropertiesLoader;

import java.util.Properties;

public class Labels {

    private static Properties properties = PropertiesLoader.loadLangProperties();

    private Labels() {
    }

    public static void setProperties(Properties properties) {
        Labels.properties = properties;
    }

    public static String getProperty(String property) {
        return Labels.properties.getProperty(property);
    }
}
