package dto;

import java.util.List;

public class Ticker {

    List<String> error;
    PriceResult result;

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public PriceResult getResult() {
        return result;
    }

    public void setResult(PriceResult result) {
        this.result = result;
    }
}
