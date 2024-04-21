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

    public static Properties loadLangProperties() {
        return loadProperties(Constants.LANG_FILE_EN);
    }
}
