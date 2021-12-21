package pt.rcaap.cienciavitae.curriculum.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import pt.cienciavitae.ns.curriculum.Curriculum;

public class CurriculumTest {
    private static final String FILE = "curriculum.xml";
    
    @Test
    public void testCurriculumClientConnection() throws ClientException {        
        RestConnector connector = new RestConnector("https://qa.cienciavitae.pt/api/v1.1", "TEST", "TEST");
        CurriculumRestClient client = new CurriculumRestClient(connector);

        //Try to perform a search - it should return 401 Forbidden error
        ClientException thrown = assertThrows(
                ClientException.class,
                () -> { 
                    client.getCurriculumByCID("1D17-89D5-91E8", "PT");
                    });

         assertTrue(thrown.getMessage().contains("Forbidden"));        
    }
    
    @Test
    public void testCurriculumClientByName() throws JAXBException, IOException, ClientException {
        InputStream is = getClass().getClassLoader().getResourceAsStream(FILE);
        Curriculum result = Extractor.unmarshal(is, Curriculum.class);
          
        assertNotNull(result);
        assertEquals(result.getIdentifyingInfo().getPersonInfo().getNames(), "João");                
    }
    
    @Test
    public void testCIDValidity() throws JAXBException, IOException, ClientException {
        String validCID = "1D17-89D5-91E8";
        String invalidCID = "1D17-89D5-00000-123";
        
        assertTrue(CienciaVitaeUtils.isValidCienciaID(validCID));
        assertFalse(CienciaVitaeUtils.isValidCienciaID(invalidCID));
    }       
}
