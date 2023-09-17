package tverdoy.healthcheck.http;

import java.net.InetAddress;

public interface IHTTPRequest {
    String template = "GET %s HTTP/1.0\r\nHost: %s\r\n\r\n";

    /**
     * @return an address that must be checked
     */
    InetAddress getAddress();


    /**
     * @return an url that must be checked
     */
    String getUrl();

    /**
     * @return a string of request HTTP package
     */
    default String generateHTTPPackage() {
        return String.format(template, getUrl(), getAddress());
    }
}
