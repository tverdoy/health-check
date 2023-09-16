package tverdoy.healthcheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    static String checkAddress = "httpstat.us";
    @Test
    void getAddressTest() {
        Request request = new Request(checkAddress);
        assertEquals(request.getAddress(), checkAddress);
    }

    @Test
    void getUrlTest() {
        String url = "/200";
        Request request = new Request(checkAddress, url);
        assertEquals(request.getUrl(), url);
    }

    @Test
    void getUrlDefault() {
        Request request = new Request(checkAddress, null);
        assertEquals(request.getUrl(), "/");
    }
}