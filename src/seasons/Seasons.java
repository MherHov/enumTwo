package seasons;

public enum Seasons {
    SPRING(5,20),
    SUMMER(30, 42),
    FALL(0, 8),
    WINTER(-14, -1);
    private final int hot;
    private final int cold;

    Seasons(int cold,int hot) {
        this.hot = hot;
        this.cold = cold;
    }

    public int getHot() {
        return hot;
    }

    public int getCold() {
        return cold;
    }
}
