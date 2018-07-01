package dto.ohlc;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class OhlcResult {

    @JsonAlias({"XXBTZUSD", "XXBTZCAD", "XXBTZJPY",
                "XETHZUSD", "XETHZCAD", "XETHZJPY"})
    private List<Entries> entries;

    public List<Entries> getEntries() {
        return entries;
    }

    public void setEntries(List<Entries> entries) {
        this.entries = entries;
    }
}
