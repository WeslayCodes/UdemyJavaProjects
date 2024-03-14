import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = getIntegers(6);
        printArray(arr);
        int[] sorted = sortIntegers(arr);
        printArray(sorted);
    }

    public static int[] getIntegers(int n) {
        int[] arr = new int[n];
        Scanner stdIn = new Scanner(System.in);

        for (int i=0; i<n; i++) {
            arr[i] = stdIn.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.printf("Element %d contents %d\n", i, arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedArr);
        for (int i=0; i<sortedArr.length/2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[sortedArr.length-i-1];
            sortedArr[sortedArr.length-i-1] = temp;
        }

        return sortedArr;
    }
}
