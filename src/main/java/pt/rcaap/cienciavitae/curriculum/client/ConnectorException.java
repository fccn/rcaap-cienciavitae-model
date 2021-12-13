package pt.rcaap.cienciavitae.curriculum.client;

/**
 * Connector exception
 * @author pgraca
 *
 */
public class ConnectorException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ConnectorException (String errorMessage) {
        super(errorMessage);
    }
}
