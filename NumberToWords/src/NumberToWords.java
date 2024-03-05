public class NumberToWords {
    private static final String INVALID_VALUE_RESPONSE = "Invalid Value";

    public static void main(String[] args) {
        numberToWords(10000);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_RESPONSE);
        }

        int numDigits = getDigitCount(number);
        int reversedNum = reverse(number);

        for (int i = 0; i < numDigits; i++) {
            int curNum = reversedNum % 10;

            switch (curNum) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }

            reversedNum /= 10;
        }
    }

    public static int reverse(int number) {
        int reversedNum = 0;

        for (int i = number; i != 0; i /= 10) {
            int lastDigit = i % 10;
            reversedNum = reversedNum * 10 + lastDigit;
        }

        return reversedNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int numDigits = 0;

        do {
            numDigits++;
            number /= 10;
        } while (number > 0);

        return numDigits;
    }
}