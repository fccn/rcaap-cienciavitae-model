package pt.rcaap.cienciavitae.curriculum.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.message.BasicNameValuePair;

/**
 * API Connector
 * @author pgraca
 *
 */
public class RestConnector {

    /**
     * OpenAIRE API Url and can be configured with: openaire.api.url
     */
    private String baseUrl = "https://qa.cienciavitae.pt/api/v1.1";

    /**
     * OpenAIRE clientSecret and can be configured with: openaire.token.clientSecret
     */
    private String basicAuthToken;

    public RestConnector(String baseUrl, String userName, String password) {
        String credentials = userName + ":" + password;
        this.baseUrl = baseUrl;
        this.basicAuthToken = Base64.getEncoder().encodeToString(credentials.getBytes());
    }

    /**
     * Perform a GET request
     * 
     * @param path with query string
     * @return an InputStream with a Result
     */
    public InputStream get(String path) throws ConnectorException {
        HttpResponse getResponse = null;
        InputStream result = null;
        path = trimSlashes(path);

        try {
            URL fullPath = new URL(baseUrl + '/' + path);

            HttpGet httpGet = new HttpGet(fullPath.toURI());
            
            if (StringUtils.isNotBlank(basicAuthToken)) {
                httpGet.addHeader("Authorization", "Basic " + basicAuthToken);
            }

            HttpClient httpClient = HttpClientBuilder.create().build();
            getResponse = httpClient.execute(httpGet);

            StatusLine status = getResponse.getStatusLine();

            // registering errors
            switch (status.getStatusCode()) {
                case HttpStatus.SC_BAD_REQUEST:
                    throw new ConnectorException("Error doing request " + baseUrl + '/' + path);
                case HttpStatus.SC_NOT_FOUND:
                    // 404 - Not found
                    throw new ConnectorException("Service not found " + baseUrl + '/' + path);
                case HttpStatus.SC_UNAUTHORIZED:
                    // 401 - Invalid Access Token
                case HttpStatus.SC_FORBIDDEN:
                    // 403 - Invalid Access Token
                    throw new ConnectorException(
                            "Service authentication credentials are required or Forbidden operation for the given authentication credentials");
                default:
                    // 200 or other
                    break;
            }

            // do not close this httpClient
                result = getResponse.getEntity().getContent();
        } catch (URISyntaxException | MalformedURLException e1) {
            throw new ConnectorException("Malformed url " + baseUrl + '/' + path + " :: " + e1.getMessage());
        } catch (UnsupportedOperationException | IOException e) {            
            throw new ConnectorException("Unsupported or IO error with " + baseUrl + '/' + path + " :: " + e.getMessage());
        }        

        return result;
    }

    /**
     * Perform a POST request
     * 
     * @param path with query string
     * @param data to send
     * @return an InputStream with a Result
     */
    public InputStream post(String path, List<NameValuePair> data) throws ConnectorException {
        InputStream result = null;
        HttpResponse response = null;
        try {
            URL fullPath = new URL(baseUrl + '/' + path);
            HttpPost httpPost = new HttpPost(fullPath.toURI());
            
            if (StringUtils.isNotBlank(basicAuthToken)) {
                httpPost.addHeader("Authorization", "Basic " + basicAuthToken);
            }
            
            /*// Request parameters and other properties.
            List<NameValuePair> params = new ArrayList<NameValuePair>();
                        
            List<String> paramList = Arrays.asList(data);
            for (String param : paramList) {
                String[] parts = param.split("=");
                params.add(new BasicNameValuePair(parts[0], parts[1]));
            }*/

            httpPost.setEntity(new UrlEncodedFormEntity(data, "UTF-8"));

            //Execute and get the response.
            HttpClient httpClient = HttpClientBuilder.create().build();
            response = httpClient.execute(httpPost);
            result = response.getEntity().getContent();
        } catch (MalformedURLException e1) {
            throw new ConnectorException("Malformed url " + baseUrl + '/' + path + " :: " + e1.getMessage());
        } catch (Exception e) {
            throw new ConnectorException("Error occured " + baseUrl + '/' + path + " :: " + e.getMessage());
        }
        return result;
    }

    public String getBasePath() {
        return this.baseUrl;
    }


    private static String trimSlashes(String path) {
        while (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        while (path.startsWith("/")) {
            path = path.substring(1);
        }
        return path;
    }

}
