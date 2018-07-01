package dto.price;

import java.util.List;

public class Ticker {

    List<String> Error;
    PriceResult result;

    public List<String> getError() {
        return Error;
    }

    public void setError(List<String> error) {
        Error = error;
    }

    public PriceResult getResult() {
        return result;
    }

    public void setResult(PriceResult result) {
        this.result = result;
    }
}
