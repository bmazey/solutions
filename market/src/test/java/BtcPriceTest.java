import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.price.Ticker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BtcPriceTest {

    BtcPrice btc = new BtcPrice();
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void getKrakenBtcUsdTickerResponse() throws IOException {
        /**
         * This test looks for a Kraken API JSON response!
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
         * This test will look for the current price of XBT.
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTUSD
         */

        String price = btc.getBtcUsdPrice();

        String response = btc.getBtcUsdPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XXBTZUSD").get("a").get(0).asText(), price);
    }

}
