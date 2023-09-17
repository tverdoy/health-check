package tverdoy.healthcheck.http;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.net.InetAddress;

class HTTPClientTest {
    @Test
    @Timeout(1)
    void openConnection() throws IOException, InterruptedException {
        HTTPRequest request = new HTTPRequest(InetAddress.getByName(HTTPRequestTest.checkAddress), "/200");
        HTTPClient client = new HTTPClient(request);
        client.openConnection();
    }
}