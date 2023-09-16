package tverdoy.healthcheck;

public class Request implements IRequest {
    private final String address;
    private final String url;

    public Request(String address) {
        this(address, null);
    }

    public Request(String checkAddress, String url) {
        this.address = checkAddress;
        this.url = url;
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
