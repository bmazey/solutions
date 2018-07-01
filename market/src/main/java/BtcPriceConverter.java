import api.KrakenApi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BtcPriceConverter {

    private KrakenApi api;

    public BtcPriceConverter() {
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

    public String getBtcCanPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();

        input.put("pair", "XBTCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        return response;
    }

    public static void main (String[] args) {

    }

}
