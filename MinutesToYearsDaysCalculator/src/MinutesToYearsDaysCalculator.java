public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE_RESPONSE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_RESPONSE);
        } else {
            long years = 0;
            long days = 0;

            years = minutes / 525600;
            days = minutes / 1440 - years * 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}