package qaautomation.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConfigReader {
    public static JsonNode getTestData(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readTree(new File("src/test/resources/" + fileName));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read test data file: " + fileName, e);
        }
    }
}
