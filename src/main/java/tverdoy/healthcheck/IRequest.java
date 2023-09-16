package tverdoy.healthcheck;

public interface IRequest {
    /**
     * @return an address that must be checked
     */
    String getAddress();


    /**
     * @return an url that must be checked
     */
    String getUrl();
}
