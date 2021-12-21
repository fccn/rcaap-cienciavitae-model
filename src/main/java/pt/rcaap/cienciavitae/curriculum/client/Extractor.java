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

public class Extractor<T> {

    /**
     * Marshal a T into a file
     * 
     * @param search
     * @param selectedFile
     * @throws IOException
     * @throws JAXBException
     */
    public static <T> void marshal(T object, Class<T> clazz, File selectedFile) throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(clazz);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(object, writer);
        writer.close();
    }

    /**
     * Unmarshal and returns a T from an URL
     * 
     * @param importFile
     * @return
     * @throws JAXBException
     */
    @SuppressWarnings("unchecked")
    public static <T> T unmarshal(URL importFile, Class<T> clazz) throws JAXBException {
        T object = null;
        JAXBContext context;

        context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
        object = (T) um.unmarshal(importFile);

        return object;
    }

    /**
     * Unmarshal and returns a T from an InputStream
     * 
     * @param iStream
     * @return
     * @throws JAXBException
     */
    @SuppressWarnings("unchecked")
    public static <T> T unmarshal(InputStream iStream, Class<T> clazz) throws JAXBException {
        T object = null;
        JAXBContext context;

        context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
        object = (T) um.unmarshal(iStream);

        return object;
    }

}
