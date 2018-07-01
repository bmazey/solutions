package dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PriceResult {

    @JsonAlias({"XXBTZUSD", "XXBTZCAD", "XXBTZJPY",
                "XETHZUSD", "XETHZCAD", "XETHZJPY"})
    private TickerPair pair;

    public TickerPair getPair() {
        return pair;
    }

    public void setPair(TickerPair pair) {
        this.pair = pair;
    }
}
