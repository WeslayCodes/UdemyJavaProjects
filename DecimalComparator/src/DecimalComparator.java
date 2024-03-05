public class DecimalComparator {
    public static void main(String[] args) {
        boolean boolVar = areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        return (int) (d1 * 1000) == (int) (d2 * 1000);
    }
}