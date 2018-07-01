import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.price.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BtcOhlc {

    private KrakenApi api;

    public BtcOhlc() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getBtcUsdOhlcResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTUSD");
        input.put("interval", "1440");
        response = api.queryPublic(KrakenApi.Method.OHLC, input);
        return response;
    }

    public String getBtcUsdOhlc() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcUsdOhlcResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public String getBtcCadOhlcResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTCAD");
        response = api.queryPublic(KrakenApi.Method.OHLC, input);
        return response;
    }

    public String getBtcCadOhlc() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcCadOhlcResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public String getBtcJpyOhlcResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTJPY");
        response = api.queryPublic(KrakenApi.Method.OHLC, input);
        return response;
    }

    public String getBtcJpyOhlc() throws IOException {
        Ticker ticker = new ObjectMapper().readValue(this.getBtcJpyOhlcResponse(), Ticker.class);
        String price = ticker.getResult().getPair().getA().get(0);
        return price;
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
