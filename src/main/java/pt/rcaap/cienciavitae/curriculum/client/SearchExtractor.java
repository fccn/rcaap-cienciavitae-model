package pt.rcaap.cienciavitae.curriculum.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import pt.cienciavitae.ns.search.Search;

/**
 * Search Results extractor
 * @author pgraca
 *
 */
public class SearchExtractor {
    

    /**
     * Marshal a Search into a file
     * @param search
     * @param selectedFile
     * @throws IOException
     * @throws JAXBException
     */
    public static void marshal(Search search, File selectedFile) throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(Search.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(search, writer);
        writer.close();
    }

    /**
     * Unmarshal and returns a Search from an URL
     * @param importFile
     * @return
     * @throws JAXBException
     */
    public static Search unmarshal(URL importFile) throws JAXBException {
        Search response = null;
        JAXBContext context;

        context = JAXBContext.newInstance(Search.class);
        Unmarshaller um = context.createUnmarshaller();
        response = (Search) um.unmarshal(importFile);

        return response;
    }

    /**
     * Unmarshal and returns a Search from an InputStream
     * 
     * @param iStream
     * @return
     * @throws JAXBException
     */
    public static Search unmarshal(InputStream iStream) throws JAXBException {
        Search search = null;
        JAXBContext context;

        context = JAXBContext.newInstance(Search.class);
        Unmarshaller um = context.createUnmarshaller();
        search = (Search) um.unmarshal(iStream);

        return search;
    }
}
