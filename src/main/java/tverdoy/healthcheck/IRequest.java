package tverdoy.healthcheck;

public interface IRequest {
    /**
     * @return an address that must be checked
     */
    String getAddress();
}
