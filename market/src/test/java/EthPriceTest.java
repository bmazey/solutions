import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EthPriceTest {

    EthPrice eth = new EthPrice();
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void getKrakenEthUsdResponse() throws IOException {

        /**
         * This test looks for a Kraken API JSON response! (ether USD pair response)
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTUSD
         */

        String response = eth.getEthUsdPriceResponse();
        assert JsonValidator.isValidJSON(response);

        JsonNode rootNode = mapper.readTree(response);
        assert !rootNode.get("result").get("XETHZUSD").isNull();
    }

    @Test
    public void getEthUsdTicker() throws IOException {

        String response = eth.getEthUsdPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = eth.getEthUsdTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XETHZUSD").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XETHZUSD").get("o").asText());
    }

    @Test
    public void getEthUsdPrice() throws IOException {

        String price = eth.getEthUsdPrice();

        String response = eth.getEthUsdPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XETHZUSD").get("o").asText(), price);
    }

    @Test
    public void getKrakenEthCadResponse() throws IOException {

        String response = eth.getEthCadPriceResponse();
        assert JsonValidator.isValidJSON(response);

        JsonNode rootNode = mapper.readTree(response);
        assert !rootNode.get("result").get("XETHZCAD").isNull();

    }

    @Test
    public void getEthCadTicker() throws IOException {

        String response = eth.getEthCadPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = eth.getEthCadTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XETHZCAD").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XETHZCAD").get("o").asText());
    }

    @Test
    public void getEthCadPrice() throws IOException {

        String price = eth.getEthCadPrice();

        String response = eth.getEthCadPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XETHZCAD").get("o").asText(), price);
    }

    @Test
    public void getEthJpyTicker() throws IOException {

        String response = eth.getEthJpyPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        Ticker ticker = eth.getEthJpyTicker();
        assertEquals(ticker.getResult().getPair().getA().size(), rootNode.get("result").get("XETHZJPY").get("a").size());
        assertEquals(ticker.getResult().getPair().getO(), rootNode.get("result").get("XETHZJPY").get("o").asText());
    }


    @Test
    public void getEthJpyPrice() throws IOException {

        String price = eth.getEthJpyPrice();

        String response = eth.getEthJpyPriceResponse();
        JsonNode rootNode = mapper.readTree(response);

        assertEquals(rootNode.get("result").get("XETHZJPY").get("o").asText(), price);
    }
}