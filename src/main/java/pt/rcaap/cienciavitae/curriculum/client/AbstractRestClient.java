package pt.rcaap.cienciavitae.curriculum.client;

public abstract class AbstractRestClient {
    RestConnector connector;

    public AbstractRestClient(RestConnector connector) {
        this.connector = connector;
    }
}
