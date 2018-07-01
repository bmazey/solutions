package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    @JsonProperty("XXBTZUSD")
    private Pair pair;

    public Pair getPair() {
        return pair;
    }

    public void setPair(Pair pair) {
        this.pair = pair;
    }
}
