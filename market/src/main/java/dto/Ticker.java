package dto;

import java.util.List;

public class Ticker {

    List<String> Error;
    Result result;

    public List<String> getError() {
        return Error;
    }

    public void setError(List<String> error) {
        Error = error;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
