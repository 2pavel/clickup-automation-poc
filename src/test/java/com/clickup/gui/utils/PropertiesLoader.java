package com.clickup.gui.utils;

import com.clickup.commons.Constants;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesLoader {

    @NotNull
    public static Properties loadProperties(String filePath) {
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(new InputStreamReader(input, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;
    }

    public static void saveProperties(String filePath) {
        Properties properties = new Properties();

        try (FileOutputStream output = new FileOutputStream(filePath)) {
            properties.store(output, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Properties loadLangProperties() {
        return loadProperties(Constants.EN_LANG_FILE);
    }

    public static Properties loadPropNames() {
        return loadProperties(Constants.PROP_NAMES_FILE);
    }

    public static void saveProps() {
        saveProperties(Constants.PROP_NAMES_FILE);
    }

}
