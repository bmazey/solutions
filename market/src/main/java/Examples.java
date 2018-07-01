import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

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

        BtcPrice btc = new BtcPrice();

        System.out.println(btc.getBtcUsdPriceResponse());
        System.out.println(btc.getBtcUsdPrice());

        BtcOhlc btcohlc = new BtcOhlc();

        System.out.println(btcohlc.getBtcUsdOhlcResponse());

        System.out.println(btc.getBtcCadPriceResponse());
        System.out.println(btc.getBtcCadPrice());

        System.out.println(btc.getBtcJpyPriceResponse());
        System.out.println(btc.getBtcJpyPrice());

        EthPrice eth = new EthPrice();

        System.out.println(eth.getEthUsdPriceResponse());
        System.out.println(eth.getEthUsdPrice());

        System.out.println(eth.getEthCadPriceResponse());
        System.out.println(eth.getEthCadPrice());

        System.out.println(eth.getEthJpyPriceResponse());
        System.out.println(eth.getEthJpyPrice());

    }
}
