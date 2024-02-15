public class NumberOfDaysInMonth {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        int febDays = 28;

        if (isLeapYear(year))
            febDays = 29;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return febDays;
            default:
                return -1;
        }
    }
}