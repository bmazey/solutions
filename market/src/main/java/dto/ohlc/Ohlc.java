package dto.ohlc;

import java.util.List;

public class Ohlc {

    List<String> error;
    OhlcResult result;

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public OhlcResult getResult() {
        return result;
    }

    public void setResult(OhlcResult result) {
        this.result = result;
    }
}
