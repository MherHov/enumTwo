package coffee;

public enum CoffeeSize {
    SMALL(10),
    MEDIUM(50),
    LARGE(100);
    private final int value;
    CoffeeSize(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
