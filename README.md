# RCAAP version of Cienciavitae Model
This is the Jaxb generated model and a simple client for Ciencia Vitae Rest API.

## Instalation using Maven
You can use maven pom.xml to include this library in your project. Just add this to your `<dependencies>`:

```
    <dependency>
      	<groupId>pt.rcaap</groupId>
      	<artifactId>cienciavitae.model</artifactId>
      	<version>1.0</version>
     </dependency>
```

## Usage Example

import pt.cienciavitae.ns.search.Search;
import pt.rcaap.cienciavitae.curriculum.client.RestConnector;
import pt.rcaap.cienciavitae.curriculum.client.SearchRestClient;

RestConnector connector = new RestConnector("https://qa.cienciavitae.pt/api/v1.1", "Username", "Password");
SearchRestClient searchPerson = new SearchRestClient(connector);

// search person by id (first row only)
Search result = searchPerson.searchPerson(id, true, null, 1, 1, 0, null);
