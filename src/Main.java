import coffee.CoffeeSize;
import planets.Planets;
import seasons.Seasons;
import weekdays.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        int x =CoffeeSize.MEDIUM.getValue();
        System.out.println(x);
        String y = Planets.EARTH.getMass();
        System.out.println(y);
        String z = DayOfWeek.FRIDAY.getDayType();
        System.out.println(z);
        int w = Seasons.SPRING.getCold();
        System.out.println(w);
    }
}