public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start > end || start <= 0) {
            return -1;
        }

        for (int i=start; i<=end; i++) {
            sum += isOdd(i) ? i : 0;
        }

        return sum;
    }
}