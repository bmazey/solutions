import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BtcPriceTest {

    BtcPrice btc = new BtcPrice();
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void getKrakenBtcUsdResponse() throws IOException {

        /**
         * This test looks for a Kraken API JSON response! (bitcoin USD pair response)
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTUSD
         */

        String response = btc.getBtcUsdPriceResponse();
        assert JsonValidator.isValidJSON(response);

        JsonNode rootNode = mapper.readTree(response);
        assert !rootNode.get("result").get("XXBTZUSD").isNull();
    }

    @Test
    public void getBtcUsdTicker() throws IOException {

        /**
         * Read about JSON ...
         * https://json.org/
         *
         * You will also need to know how to use a marshalling technology, such as Jackson (included via Maven).
         * http://www.baeldung.com/jackson-object-mapper-tutorial
         *
         * Good luck!
         */

        String response = btc.getBtcUsdPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = btc.getBtcUsdTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XXBTZUSD").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XXBTZUSD").get("o").asText());
    }

    @Test
    public void getBtcUsdPrice() throws IOException {

        /**
         * This test will look for the current price of bitcoin in USD.
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTUSD
         *
         * NOTE!
         * You are not allowed to use a JsonNode in your implementation!
         */

        String price = btc.getBtcUsdPrice();

        String response = btc.getBtcUsdPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XXBTZUSD").get("o").asText(), price);
    }

    @Test
    public void getKrakenBtcCadResponse() throws IOException {

        /**
         * This test looks for a Kraken API JSON response! (bitcoin CAD pair response)
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTCAD
         */

        String response = btc.getBtcCadPriceResponse();
        assert JsonValidator.isValidJSON(response);

        JsonNode rootNode = mapper.readTree(response);
        assert !rootNode.get("result").get("XXBTZCAD").isNull();

    }

    @Test
    public void getBtcCadTicker() throws IOException {

        String response = btc.getBtcCadPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = btc.getBtcCadTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XXBTZCAD").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XXBTZCAD").get("o").asText());
    }

    @Test
    public void getBtcCadPrice() throws IOException {

        /**
         * This test will look for the current price of bitcoin in CAD.
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTCAD
         *
         * NOTE!
         * You are not allowed to use a JsonNode in your implementation!
         *
         */

        String price = btc.getBtcCadPrice();

        String response = btc.getBtcCadPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XXBTZCAD").get("o").asText(), price);
    }

    @Test
    public void getBtcJpyTicker() throws IOException {

        String response = btc.getBtcJpyPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = btc.getBtcJpyTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XXBTZJPY").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XXBTZJPY").get("o").asText());
    }


    @Test
    public void getBtcJpyPrice() throws IOException {

        String price = btc.getBtcJpyPrice();

        String response = btc.getBtcJpyPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XXBTZJPY").get("o").asText(), price);
    }
}
