public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.printf("" + getGreatestCommonDivisor(25, 15));
        System.out.printf("\n" + getGreatestCommonDivisor(12, 30));
        System.out.printf("\n" + getGreatestCommonDivisor(9, 18));
        System.out.printf("\n" + getGreatestCommonDivisor(23458234, 432589423));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        boolean firstBigger = first > second;
        int curDivisor = firstBigger ? second : first;

        while (curDivisor >= 1) {
            boolean dividesFirst = first % curDivisor == 0;
            boolean dividesSecond = second % curDivisor == 0;

            if (dividesFirst && dividesSecond) {
                break;
            }

            curDivisor--;
        }

        return curDivisor;
    }
}