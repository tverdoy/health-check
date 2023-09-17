package tverdoy.healthcheck.http;

import java.io.IOException;

public interface IHTTPClient {
    /**
     * Open connection to remote node
     */
    void openConnection() throws IOException;

    void sendRequest();
}
