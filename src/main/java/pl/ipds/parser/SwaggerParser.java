package pl.ipds.parser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import pl.ipds.model.SwaggerDocument;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SwaggerParser {

  public static SwaggerDocument parse(String file) {
    SwaggerDocument swaggerDocument = null;
    try {
      String content = new String(Files.readAllBytes(Paths.get(file)));
      return parseContent(content);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return swaggerDocument;
  }

  public static SwaggerDocument parseContent(String content) {
    if (content.startsWith("{")) {
      return jsonToSwaggerDocument(content);
    } else {
      return yamlToSwaggerDocument(content);
    }
  }

  public static SwaggerDocument jsonToSwaggerDocument(String content) {
    ObjectMapper mapper = new ObjectMapper();
    // TODO move to config
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    SwaggerDocument swaggerDocument = null;
    try {
      swaggerDocument = mapper.readValue(content, SwaggerDocument.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return swaggerDocument;
  }

  public static SwaggerDocument yamlToSwaggerDocument(String content) {

    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    SwaggerDocument swaggerDocument = null;
    try {
      swaggerDocument = mapper.readValue(content, SwaggerDocument.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
//    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
//    SwaggerDocument swaggerDocument = null;
//    try {
//      swaggerDocument = mapper.readValue(content, SwaggerDocument.class);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    return swaggerDocument;
  }

  public static SwaggerDocument parse(URI uri) {
    try {
      String content = new String(Files.readAllBytes(Paths.get(uri)));
      return parseContent(content);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
