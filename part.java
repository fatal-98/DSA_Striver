
import java.util.Arrays;

public class part {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        rightRotate(array, d);
        System.out.println("Array after right rotation by " + d + " places: " + Arrays.toString(array));
    }

    private static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        // To handle cases where d is greater than the array length
        d = d % n;

        // Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Reverse the first 'd' elements
        reverseArray(arr, 0, d - 1);

        // Reverse the remaining elements
        reverseArray(arr, d, n - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
}
