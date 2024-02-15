public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(19));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        for (int i=1; i<=number; i++) {
            if (number == 2 || number % i == 0) {
                // must start at 2 or won't take original number into consideration
                for (int j=2; j==number/i || j<=number/i && number/i%j!=0; j++) {
                    if (j == number / i)
                        return number / i;
                }
            }
        }

        return -1;
    }
}