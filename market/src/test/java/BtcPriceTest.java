import org.junit.Test;

import java.io.IOException;

public class BtcPriceTest {

    BtcPrice btc = new BtcPrice();

    @Test
    public void getKrakenUsdBtcTickerResponse() throws IOException {
        /**
         * This test looks for a Kraken API JSON response!
         * GET https://api.kraken.com/0/public/Ticker?pair=XBTUSD
         */

        String response = btc.getBtcUsdPriceResponse();
        assert JsonValidator.isValidJSON(response);
    }

    @Test
    public void getUsdPriceOfBtc() {

    }

}
