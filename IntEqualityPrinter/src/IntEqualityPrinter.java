public class IntEqualityPrinter {
    private static final String INVALID_VALUE_RESPONSE = "Invalid Value";

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0)
            System.out.println(INVALID_VALUE_RESPONSE);
        else if (x == y && y == z)
            System.out.println("All numbers are equal");
        else if (x == y || y == z || x == z)
            System.out.println("Neither all are equal or different");
        else
            System.out.println("All numbers are different");
    }
}