import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.price.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EthPrice {

    private KrakenApi api;

    public EthPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getEthUsdPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "ETHUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public String getEthUsdPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getEthUsdPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public String getEthCadPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "ETHCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public String getEthCadPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getEthCadPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public String getEthJpyPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "ETHJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public String getEthJpyPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getEthJpyPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
