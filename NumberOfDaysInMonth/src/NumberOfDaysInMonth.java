public class NumberOfDaysInMonth {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        boolean validYear = year >= 1 && year <= 9999;
        boolean fourMultiple = year % 4 == 0;
        boolean hundredMultiple = year % 100 == 0;
        boolean fourHundredMultiple = year % 400 == 0;

        return validYear && fourMultiple && (!hundredMultiple || fourHundredMultiple);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}