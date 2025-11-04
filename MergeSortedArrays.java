import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge two sorted arrays (num1 and num2) into num1
    public static int[] merge(int[] num1, int m, int[] num2, int n) {
        // Start from the end of both arrays
        int i = m - 1;        // Last valid element index in num1
        int j = n - 1;        // Last element index in num2
        int k = m + n - 1;    // Last index of num1 (final array size)

        // Merge from the end towards the beginning
        while (i >= 0 && j >= 0) {
            // Compare elements from the back and place the larger one at the end
            if (num1[i] < num2[j]) {
                num1[k] = num2[j];
                j--;
            } else {
                num1[k] = num1[i];
                i--;
            }
            k--;
        }

        // If any elements remain in num2, copy them to num1
        // (no need to check num1, because its remaining elements are already in place)
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }

        // Return the merged sorted array
        return num1;
    }

    public static void main(String[] args) {
        // Example input arrays
        int[] num1 = {1, 3, 5, 0, 0, 0};  // num1 has extra space for num2 elements
        int m = 3;  // number of valid elements in num1

        int[] num2 = {2, 4, 6};
        int n = 3;  // number of elements in num2

        // Call the merge function
        int[] result = merge(num1, m, num2, n);

        // Display the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}
