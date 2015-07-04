package pl.ipds.model;

public class SwaggerDocumentInfo {

  private String version;
  private String title;
  private SwaggerDocumentLicense license;

  public SwaggerDocumentInfo() {
  }

  public SwaggerDocumentLicense getLicense() {
    return license;
  }

  public void setLicense(SwaggerDocumentLicense license) {
    this.license = license;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
