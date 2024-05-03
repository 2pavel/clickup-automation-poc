package com.clickup.commons;

import com.clickup.gui.utils.PropertiesLoader;

import java.util.Properties;

public class Labels {

    private static Properties lang = PropertiesLoader.loadLangProperties();

    private static Properties props = PropertiesLoader.loadPropNames();

    private Labels() {
    }

    public static void setLang(Properties lang) {
        Labels.lang = lang;
    }

    public static String getExpected(String property) {
        return Labels.lang.getProperty(property);
    }

    public static String getProp(String property) {
        return Labels.props.getProperty(property);
    }

}
