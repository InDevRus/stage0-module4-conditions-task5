package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(switch (year % 4) {
            case 0 -> !(year % 100 == 0) || year % 400 == 0 ? "leap" : "not leap";
            default -> "not leap";
        });
    }
}
