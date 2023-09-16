package tverdoy.healthcheck;

public class Request implements IRequest {
    private final String address;

    public Request(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
