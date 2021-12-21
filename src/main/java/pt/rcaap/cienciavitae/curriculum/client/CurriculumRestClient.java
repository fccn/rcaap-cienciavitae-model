package pt.rcaap.cienciavitae.curriculum.client;

import java.io.InputStream;
import javax.xml.bind.JAXBException;
import pt.cienciavitae.ns.curriculum.Curriculum;

/**
 * Curriculum endpoints rest client
 * 
 * @author pgraca
 *
 */
public class CurriculumRestClient extends AbstractRestClient {
    public CurriculumRestClient(RestConnector connector) {
        super(connector);
    }

    /**
     * Get a curriculum by Ciencia ID
     * 
     * @param cienciaID
     * @param lang
     * @return
     * @throws ClientException
     */
    public Curriculum getCurriculumByCID(String cienciaID, String lang) throws ClientException {
        if (connector == null) {
            throw new ClientException("Search Rest Connector required");
        }
        if (!CienciaVitaeUtils.isValidCienciaID(cienciaID)) {
            throw new ClientException("Invalid CienciaID: " + cienciaID);
        }

        // setting default value for lang
        if (lang == null || CienciaVitaeUtils.LANG.valueOf(lang) == null) {
            lang = CienciaVitaeUtils.LANG.PT.name();
        }

        String[] queryStringPagination = { "lang=" + lang };
        String path = "/curriculum/" + cienciaID + "?" + String.join("&", queryStringPagination);

        InputStream result = null;

        try {
            result = this.connector.get(path);
            if (result != null) {
                return Extractor.unmarshal(result, Curriculum.class);
            }

        } catch (JAXBException e) {
            throw new ClientException("Client jaxb error: " + e.getMessage());
        } catch (ConnectorException e1) {
            throw new ClientException("Client connector error for query" + cienciaID + "::" + e1.getMessage());
        }

        return null;
    }
}
