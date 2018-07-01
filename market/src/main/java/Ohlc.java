import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.price.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ohlc {

    private KrakenApi api;

    public Ohlc() {
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

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
