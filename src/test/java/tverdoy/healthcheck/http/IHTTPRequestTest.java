package tverdoy.healthcheck.http;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

class IHTTPRequestTest {
    @Test
    void generateHTTPRequestTest() throws UnknownHostException {
        String url = "/test";
        HTTPRequest request = new HTTPRequest(InetAddress.getByName(HTTPRequestTest.checkAddress), url);
        String httpPackage = request.generateHTTPPackage();

        String[] split = httpPackage.split("\r\n");

        assertTrue(httpPackage.endsWith("\r\n\r\n"));
        assertTrue(split.length > 1);

        String[] firstLine = split[0].split(" ");
        assertEquals(firstLine[0], "GET");
        assertEquals(firstLine[1], url);
    }
}