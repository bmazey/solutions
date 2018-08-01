package api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String ResourceUrl = "http://pythonorangeiguanas-env.tpemta5ejb.us-east-2.elasticbeanstalk.com/pokemon";
        ResponseEntity<String> response
                = restTemplate.getForEntity(ResourceUrl + "/Ralts", String.class);

        System.out.println("response status: " + response.getStatusCode().toString());
        System.out.println("response body: " + response.getBody());
    }
}
