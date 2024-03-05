public class LeapYear {
    public static void main(String[] args) {}

    public static boolean isLeapYear(int year) {
        boolean validYear = year >= 1 && year <= 9999;
        boolean fourMultiple = year % 4 == 0;
        boolean hundredMultiple = year % 100 == 0;
        boolean fourHundredMultiple = year % 400 == 0;

        return validYear && fourMultiple && (!hundredMultiple || fourHundredMultiple);
    }
}