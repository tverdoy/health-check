package tverdoy.healthcheck.http;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

class HTTPRequestTest {
    static String checkAddress = "httpstat.us";
    @Test
    void getAddressTest() throws UnknownHostException {
        HTTPRequest request = new HTTPRequest(InetAddress.getByName(checkAddress));
        assertEquals(request.getAddress().getHostName(), checkAddress);
    }

    @Test
    void getUrlTest() throws UnknownHostException {
        String url = "/200";
        HTTPRequest request = new HTTPRequest(InetAddress.getByName(checkAddress), url);
        assertEquals(request.getUrl(), url);
    }

    @Test
    void getUrlDefaultTest() throws UnknownHostException {
        HTTPRequest request = new HTTPRequest(InetAddress.getByName(checkAddress));
        assertEquals(request.getUrl(), "/");
    }
}