package tverdoy.healthcheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    @Test
    void getAddressTest() {
        String address = "httpstat.us";
        Request request = new Request(address);
        assertEquals(request.getAddress(), address);
    }
}