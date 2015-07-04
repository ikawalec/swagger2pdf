package pl.ipds.model;

import java.util.List;
import java.util.Map;

public class SwaggerDocument {

  private String swagger;

  private String host;

  private SwaggerDocumentInfo info;

  private String basePath;

  private List<String> schemes;

  private List<String> consumes;

  private List<String> produces;

  private Map<String, SwaggerDocumentPath> paths;

  private Map<String, SwaggerDocumentDefinition> definitions;

  public SwaggerDocument() {
  }

  public String getBasePath() {
    return basePath;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public List<String> getConsumes() {
    return consumes;
  }

  public void setConsumes(List<String> consumes) {
    this.consumes = consumes;
  }

  public Map<String, SwaggerDocumentDefinition> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(Map<String, SwaggerDocumentDefinition> definitions) {
    this.definitions = definitions;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SwaggerDocumentInfo getInfo() {
    return info;
  }

  public void setInfo(SwaggerDocumentInfo info) {
    this.info = info;
  }

  public Map<String, SwaggerDocumentPath> getPaths() {
    return paths;
  }

  public void setPaths(Map<String, SwaggerDocumentPath> paths) {
    this.paths = paths;
  }

  public List<String> getProduces() {
    return produces;
  }

  public void setProduces(List<String> produces) {
    this.produces = produces;
  }

  public List<String> getSchemes() {
    return schemes;
  }

  public void setSchemes(List<String> schemes) {
    this.schemes = schemes;
  }

  public String getSwagger() {
    return swagger;
  }

  public void setSwagger(String swagger) {
    this.swagger = swagger;
  }
}
