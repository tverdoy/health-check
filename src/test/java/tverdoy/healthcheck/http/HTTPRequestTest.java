package tverdoy.healthcheck.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTTPRequestTest {
    static String checkAddress = "httpstat.us";
    @Test
    void getAddressTest() {
        HTTPRequest request = new HTTPRequest(checkAddress);
        assertEquals(request.getAddress(), checkAddress);
    }

    @Test
    void getUrlTest() {
        String url = "/200";
        HTTPRequest request = new HTTPRequest(checkAddress, url);
        assertEquals(request.getUrl(), url);
    }

    @Test
    void getUrlDefaultTest() {
        HTTPRequest request = new HTTPRequest(checkAddress, null);
        assertEquals(request.getUrl(), "/");
    }
}