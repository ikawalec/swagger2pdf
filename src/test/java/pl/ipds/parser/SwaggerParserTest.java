package pl.ipds.parser;

import org.junit.Test;
import pl.ipds.helpers.ResourceHelper;
import pl.ipds.model.SwaggerDocument;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SwaggerParserTest {

  @Test
  public void testParseJson() {
    SwaggerDocument document = SwaggerParser.parse(ResourceHelper.getURI("json/petstore.json"));
    assertSwaggerDocumentEquals(document);
  }

  @Test
  public void testParseYaml() {
    SwaggerDocument document = SwaggerParser.parse(ResourceHelper.getURI("yaml/petstore.yaml"));
    assertSwaggerDocumentEquals(document);
  }

  private void assertSwaggerDocumentEquals(SwaggerDocument document) {
    assertEquals("2.0", document.getSwagger());
    assertEquals("petstore.swagger.io", document.getHost());
    assertEquals("/api", document.getBasePath());
    assertEquals(Arrays.asList("http"), document.getSchemes());
    assertEquals(1, document.getPaths().size());
  }
}