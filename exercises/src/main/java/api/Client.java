package api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String ResourceUrl = "http://pythonsilversnakes-env.vpvuz9g3gj.us-east-2.elasticbeanstalk.com";
        ResponseEntity<String> response
                = restTemplate.getForEntity(ResourceUrl + "/hello", String.class);

        System.out.println("response status: " + response.getStatusCode().toString());
        System.out.println("response body: " + response.getBody());
    }
}
