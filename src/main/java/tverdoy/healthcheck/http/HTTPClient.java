package tverdoy.healthcheck.http;

import java.io.IOException;
import java.net.Socket;

public class HTTPClient implements IHTTPClient {
    private final HTTPRequest request;
    private Socket socket;

    public HTTPClient(HTTPRequest request) {
        this.request = request;
    }

    @Override
    public void openConnection() throws IOException {
        socket = new Socket(request.getAddress(), 80);
    }

    @Override
    public void sendRequest() {

    }
}
