
import api.KrakenApi;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import api.KrakenApi.Method;

public class Examples {

    public static void main(String[] args) throws IOException, InvalidKeyException, NoSuchAlgorithmException {


//        String response;
//        Map<String, String> input = new HashMap<>();
//
//        input.put("pair", "XBTEUR");
//        response = api.queryPublic(Method.TICKER, input);
//        System.out.println(response);
//
//        input.clear();
//        input.put("pair", "XBTEUR,XBTUSD");
//        response = api.queryPublic(Method.ASSET_PAIRS, input);
//        System.out.println(response);
//
//        input.clear();
//        input.put("asset", "ZEUR");
//        response = api.queryPrivate(Method.BALANCE, input);
//        System.out.println(response);

        BtcPriceConverter btc = new BtcPriceConverter();
        System.out.println(btc.getBtcCanPriceResponse());
    }
}
