public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrimeFactor = -1;
        for (int i = number; i >= 2; i--) {
            boolean isEven = i % 2 == 0 && i != 2;
            boolean isFactor = number % i == 0;

            if (isEven || !isFactor) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                largestPrimeFactor = i;
                break;
            }
        }

        return largestPrimeFactor;
    }
}