package exerciseTwo;

public class ExerciseTwoMain {
    public static void main(String[] args) {

        System.out.println("Is '" + Weekday.SATURDAY.getWeekDay() + "' a holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Is '" + Weekday.FRIDAY.getWeekDay() + "' a weekday: " + Weekday.FRIDAY.isWeekDay());

        Weekday.TUESDAY.whichIsGreater(Weekday.TUESDAY, Weekday.MONDAY);
    }
}
