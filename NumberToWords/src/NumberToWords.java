public class NumberToWords {
    private static final String INVALID_VALUE_RESPONSE = "Invalid Value";

    public static void main(String[] args) {
        numberToWords(10000);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println(INVALID_VALUE_RESPONSE);

        int numDigits = getDigitCount(number);
        int reversedNum = reverse(number);

        while (numDigits > 0) {
            int curNum = reversedNum % 10;

            switch(curNum) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNum /= 10;
            numDigits--;
        }
    }

    public static int reverse(int number) {
        int reversedNum = 0;

        while (number != 0) {
            reversedNum *= 10;
            reversedNum += number % 10;
            number /= 10;
        }

        return reversedNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int numDigits = 0;

        do {
            numDigits++;
            number /= 10;
        } while (number > 0);

        return numDigits;
    }
}