import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int n = readInteger();
        int[] elements = readElements(n);
        int min = findMin(elements);

        System.out.println(min);
    }

    private static int readInteger() {
        Scanner stdIn = new Scanner(System.in);
        return stdIn.nextInt();
    }

    private static int[] readElements(int n) {
        int[] elements = new int[n];
        Scanner stdIn = new Scanner(System.in);

        for (int i=0; i<n; i++) {
            elements[i] = stdIn.nextInt();
        }

        return elements;
    }

    private static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;

        for (int i=0; i<elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }

        return min;
    }
}