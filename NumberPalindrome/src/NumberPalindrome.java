public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        if (number < 0) {
            number *= -1;
            originalNumber *= -1;
        }

        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}