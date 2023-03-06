package weekdays;

public enum DayOfWeek {
    MONDAY("workday"),
    TUESDAY("workday"),
    WEDNESDAY("workday"),
    THURSDAY("workday"),
    FRIDAY("workday"),
    SATURDAY("weekend"),
    SUNDAY("weekend");
    private final String dayType;

    DayOfWeek(String dayType) {
        this.dayType = dayType;
    }

    public String getDayType() {
        return dayType;
    }
}
