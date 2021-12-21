package pt.rcaap.cienciavitae.curriculum.client;

/**
 * Client Exception
 * @author pgraca
 *
 */
public class ClientException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ClientException (String errorMessage) {
        super(errorMessage);
    }
}
