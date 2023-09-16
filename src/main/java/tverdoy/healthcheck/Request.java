package tverdoy.healthcheck;

import org.jetbrains.annotations.NotNull;

public class Request implements IRequest {
    private final String address;
    private final String url;

    /**
     * Create Request with address and default url '/'
     * @param address - address that must be checked
     */
    public Request(@NotNull String address) {
        this(address, null);
    }

    /**
     * @param checkAddress - address that must be checked
     * @param url - url that must be checked. if the url is empty, it creates a default URL '/'
     */
    public Request(@NotNull String checkAddress, String url) {
        this.address = checkAddress;
        this.url = url == null ? "/" : url;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
