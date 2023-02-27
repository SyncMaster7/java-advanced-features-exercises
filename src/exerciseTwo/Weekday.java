package exerciseTwo;

public enum Weekday {
    MONDAY("monday", 1),
    TUESDAY("tuesday", 2),
    WEDNESDAY("wednesday", 3),
    THURSDAY("thursday", 4),
    FRIDAY("friday", 5),
    SATURDAY("saturday", 6),
    SUNDAY("sunday", 7);

    private final String weekDay;
    private final int dayNumber;

    public String getWeekDay() {
        return weekDay;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    Weekday(String weekDay, int dayNumber) {
        this.weekDay = weekDay;
        this.dayNumber = dayNumber;
    }

    boolean isWeekDay() {
        return dayNumber > 0 && dayNumber < 6;
//        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday() {
//        return this == SATURDAY || this == SUNDAY;
        return dayNumber <= 6;
    }

    void whichIsGreater(Weekday weekday1, Weekday weekday2) {
        if (weekday1.compareTo(weekday2) > 0) {
            System.out.println(weekday1 + " is after " + weekday2);
        } else if (weekday1.compareTo(weekday2) < 0) {
            System.out.println(weekday1 + " is before " + weekday2);
        } else {
            System.out.println(weekday1 + " is equal to " + weekday2);
        }
    }
}
