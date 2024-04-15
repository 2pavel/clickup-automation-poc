package com.clickup.gui.utils;

import com.clickup.commons.Constants;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonUtils {

    public static String getJsonNode(String node) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String actorsJson = Files.readString(Path.of(Constants.ACTORS_FILE));
        JsonNode rootNode = mapper.readTree(actorsJson);
        return String.format("{\"%s\": %s }", node, rootNode.path(node).toString());
    }
}
