package pl.camp.it.generics;

public class Pair<TYP1, TYP2> {
    private TYP1 first;
    private TYP2 second;

    public Pair(TYP1 first, TYP2 second) {
        this.first = first;
        this.second = second;
    }

    public TYP1 getFirst() {
        return first;
    }

    public void setFirst(TYP1 first) {
        this.first = first;
    }

    public TYP2 getSecond() {
        return second;
    }

    public void setSecond(TYP2 second) {
        this.second = second;
    }
}
