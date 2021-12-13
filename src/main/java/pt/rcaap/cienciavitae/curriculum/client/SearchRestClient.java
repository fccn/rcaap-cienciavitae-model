package pt.rcaap.cienciavitae.curriculum.client;

import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.JAXBException;
import pt.cienciavitae.ns.search.Search;

/**
 * Simple search rest client
 * @author pgraca
 *
 */
public class SearchRestClient {
    RestConnector connector;

    public SearchRestClient(RestConnector connector) {
        this.connector = connector;
    }

    /**
     * Perform a Person Search request by a query
     * 
     * @param query
     * @param pagination
     * @param order
     * @param rows
     * @param page
     * @param limit
     * @param lang
     * @return CienciaVitae Search response if found or null otherwise
     * @throws ClientException
     */
    public Search searchPerson(String query, boolean pagination, String order, int rows, int page, int limit,
            String lang) throws ClientException {
        if (connector == null) {
            throw new ClientException("Search Rest Connector required");
        }
        String[] queryStringPagination = { "page=" + page, "rows=" + rows, "pagination=" + pagination, "order=" + order,
                "limit=" + limit, "lang=" + lang };
        String path = "/searches/persons";
        String queryString = path + ((path.indexOf("?") > 0) ? "&query=" : "?query=")
                + URLEncoder.encode(query, StandardCharsets.UTF_8) + "&" + String.join("&", queryStringPagination);

        InputStream result = null;

        try {
            result = this.connector.get(queryString);
            if (result != null) {
                return SearchExtractor.unmarshal(result);
            }

        } catch (JAXBException e) {
            throw new ClientException("Client jaxb error: " + e.getMessage());
        } catch (ConnectorException e1) {
            throw new ClientException("Client connector error for query" + query + "::" + e1.getMessage());
        }

        return null;
    }
}
