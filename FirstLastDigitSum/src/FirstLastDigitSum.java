public class FirstLastDigitSum {
    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number > 0) {
            if (number / 10 == 0) {
                return lastDigit + number % 10;
            }

            number /= 10;
        }

        return number; // Only gets here if number is 0
    }
}