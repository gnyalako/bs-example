package cbp.ace.truck.graphql;

import cbp.ace.truck.graphql.config.AppConfig;
import cbp.ace.truck.graphql.service.AccountService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerIntegrationTest {
    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();


    @Test
    public void testGetAccount() throws Exception{
        String url = "http://localhost:" + port + "/graphql";
        String req = "query{ accounts(accountId:1){ accountId, firstName, lastName } }";
        headers.set("Content-Type", "application/graphql");

        RequestEntity<String> request = new RequestEntity<String>(req, headers, HttpMethod.POST, new URI(url));

        ResponseEntity<String> response = restTemplate.exchange(request, String.class);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(response.getBody());
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode data = root.get("data");
        JsonNode account = data.get("accounts");
        Assert.assertEquals(account.get("accountId").asInt(), 1);
        Assert.assertEquals(account.get("firstName").asText(), "John");
        Assert.assertEquals(account.get("lastName").asText(), "Doe");
    }


}

