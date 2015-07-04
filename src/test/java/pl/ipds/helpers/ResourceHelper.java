package pl.ipds.helpers;

import java.net.URI;
import java.net.URISyntaxException;

public class ResourceHelper {

  public static URI getURI(String name) {
    URI uri = null;
    try {
      uri = ResourceHelper.class.getClassLoader().getResource(name).toURI();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return uri;
  }
}
