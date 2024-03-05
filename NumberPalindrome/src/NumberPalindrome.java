public class NumberPalindrome {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 2000) - 1000;
        isPalindrome(number);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber;
        int reversedNumber = 0;

        number *= number < 0 ? -1 : 1;
        originalNumber = number;

        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}