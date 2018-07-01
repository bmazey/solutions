
import api.KrakenApi;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import api.KrakenApi.Method;

public class Examples {

    public static void main(String[] args) throws IOException, InvalidKeyException, NoSuchAlgorithmException {

        KrakenApi api = new KrakenApi();
        api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");

        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTEUR");
        response = api.queryPublic(Method.TICKER, input);
        System.out.println(response);

        input.clear();
        input.put("pair", "XBTEUR,XBTUSD");
        response = api.queryPublic(Method.ASSET_PAIRS, input);
        System.out.println(response);

        input.clear();
        input.put("asset", "ZEUR");
        response = api.queryPrivate(Method.BALANCE, input);
        System.out.println(response);
    }
}
