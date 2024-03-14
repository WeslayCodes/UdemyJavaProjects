import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        System.out.printf("Array = %s\n", Arrays.toString(arr));

        for (int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.printf("Reversed array = %s\n", Arrays.toString(arr));
    }
}