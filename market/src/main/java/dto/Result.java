package dto;


import com.fasterxml.jackson.annotation.JsonAlias;

public class Result {

    @JsonAlias({"XXBTZUSD","XXBTZCAD"})
    private Pair pair;

    public Pair getPair() {
        return pair;
    }

    public void setPair(Pair pair) {
        this.pair = pair;
    }
}
