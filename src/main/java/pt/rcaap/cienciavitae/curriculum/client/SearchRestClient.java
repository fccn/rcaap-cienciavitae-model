package pt.rcaap.cienciavitae.curriculum.client;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.JAXBException;
import pt.cienciavitae.ns.search.Search;

/**
 * Simple search rest client
 * 
 * @author pgraca
 *
 */
public class SearchRestClient extends AbstractRestClient {

    public SearchRestClient(RestConnector connector) {
        super(connector);
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

        // setting default value for order
        if (order == null || CienciaVitaeUtils.ORDER.valueOf(order) == null) {
            order = CienciaVitaeUtils.ORDER.Ascending.name();
        }

        // setting default value for lang
        if (lang == null || CienciaVitaeUtils.LANG.valueOf(lang) == null) {
            lang = CienciaVitaeUtils.LANG.PT.name();
        }

        String[] queryStringPagination = { "page=" + page, "rows=" + rows, "pagination=" + pagination, "order=" + order,
                "limit=" + limit, "lang=" + lang };
        String path = "/searches/persons";
        try {
            String queryString = path + ((path.indexOf("?") > 0) ? "&query=" : "?query=")
                    + URLEncoder.encode(query, StandardCharsets.UTF_8.name()) + "&"
                    + String.join("&", queryStringPagination);

            InputStream result = null;

            try {
                result = this.connector.get(queryString);
                if (result != null) {
                    return Extractor.unmarshal(result, Search.class);
                }

            } catch (JAXBException e) {
                throw new ClientException("Client jaxb error: " + e.getMessage());
            } catch (ConnectorException e1) {
                throw new ClientException("Client connector error for query" + query + "::" + e1.getMessage());
            }
        } catch (UnsupportedEncodingException e2) {
            throw new ClientException("Client URL error for query" + query + "::" + e2.getMessage());
        }

        return null;
    }
}
