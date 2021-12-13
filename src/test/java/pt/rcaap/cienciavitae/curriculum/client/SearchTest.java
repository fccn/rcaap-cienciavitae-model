package pt.rcaap.cienciavitae.curriculum.client;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBException;
import pt.cienciavitae.ns.search.Search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for search.
 */
public class SearchTest
{
    private static final String FILE = "result.xml";
    
    @Test
    public void testSearchClientConnection() {        
        RestConnector connector = new RestConnector("https://qa.cienciavitae.pt/api/v1.1", "TEST", "TEST");
        SearchRestClient client = new SearchRestClient(connector);

        //Try to perform a search - it should return 401 Forbidden error
        ClientException thrown = assertThrows(
                ClientException.class,
                () -> { 
                    client.searchPerson("Moreira", true, "Ascending", 1, 1, 1, "PT");
                    });

         assertTrue(thrown.getMessage().contains("Forbidden"));        
    }
    
    @Test
    public void testSearchClientByName() throws JAXBException, IOException, ClientException {
        InputStream is = getClass().getClassLoader().getResourceAsStream(FILE);
        Search search = SearchExtractor.unmarshal(is);
          
        assertNotNull(search);
        assertEquals(search.getSummary().getTotal(), 2);        
        assertEquals(search.getResult().getPerson().get(0).getPersonInfo().getNames(), "JOÃO ALEXANDRE");                
    }    
}
