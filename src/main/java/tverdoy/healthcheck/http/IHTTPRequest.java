package tverdoy.healthcheck.http;

public interface IHTTPRequest {
    String template = "GET %s HTTP/1.0\r\nHost: %s\r\n\r\n";

    /**
     * @return an address that must be checked
     */
    String getAddress();


    /**
     * @return an url that must be checked
     */
    String getUrl();

    default String generateHTTPPackage() {
        return String.format(template, getUrl(), getAddress());
    }
}
