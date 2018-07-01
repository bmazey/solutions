import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BtcPrice {

    private KrakenApi api;

    public BtcPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getBtcUsdPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public Ticker getBtcUsdTicker() throws IOException {
        return new ObjectMapper().readValue(this.getBtcUsdPriceResponse(), Ticker.class);
    }

    public String getBtcUsdPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcUsdPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getO();
        return price;
    }

    public String getBtcCadPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public Ticker getBtcCadTicker() throws IOException {
        return new ObjectMapper().readValue(this.getBtcCadPriceResponse(), Ticker.class);
    }

    public String getBtcCadPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcCadPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getO();
        return price;
    }

    public String getBtcJpyPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public Ticker getBtcJpyTicker() throws IOException {
        return new ObjectMapper().readValue(this.getBtcJpyPriceResponse(), Ticker.class);
    }

    public String getBtcJpyPrice() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcJpyPriceResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getO();
        return price;
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }

}
