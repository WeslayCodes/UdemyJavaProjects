import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;
        boolean isInt = true;

        while (stdIn.hasNextInt()) {
            sum += stdIn.nextInt();
            count++;
        }

        if (count != 0)
            average = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);
        stdIn.close();
    }
}