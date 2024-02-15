public class SharedDigit {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
            return false;

        int originalNum2 = num2;

        while (num1 > 0) {
            while (num2 > 0) {
                if (num2 % 10 == num1 % 10)
                    return true;
                num2 /= 10;
            }

            num1 /= 10;
            num2 = originalNum2;
        }

        return false;
    }
}