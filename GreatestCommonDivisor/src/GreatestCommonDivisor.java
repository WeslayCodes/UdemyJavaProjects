public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.printf("" + getGreatestCommonDivisor(25, 15));
        System.out.printf("\n" + getGreatestCommonDivisor(12, 30));
        System.out.printf("\n" + getGreatestCommonDivisor(9, 18));
        System.out.printf("\n" + getGreatestCommonDivisor(23458234, 432589423));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int curDivisor;

        if (first > second)
            curDivisor = second;
        else
            curDivisor = first;

        while (curDivisor >= 1) {
            if (first % curDivisor == 0 && second % curDivisor == 0)
                return curDivisor;
            curDivisor--;
        }

        return curDivisor;
    }
}