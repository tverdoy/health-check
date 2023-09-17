package tverdoy.healthcheck.http;

import org.jetbrains.annotations.NotNull;

import java.net.InetAddress;

public class HTTPRequest implements IHTTPRequest {
    private final InetAddress address;
    private final String url;

    /**
     * Create Request with address and default url '/'
     * @param address - address that must be checked
     */
    public HTTPRequest(@NotNull InetAddress address) {
        this(address, null);
    }

    /**
     * @param checkAddress - address that must be checked
     * @param url - url that must be checked. if the url is empty, it creates a default URL '/'
     */
    public HTTPRequest(@NotNull InetAddress checkAddress, String url) {
        this.address = checkAddress;
        this.url = url == null ? "/" : url;
    }

    @Override
    public InetAddress getAddress() {
        return address;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
