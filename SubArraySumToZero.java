import java.util.*;

public class SubArraySumToZero {

    // Function to find the maximum length of a subarray with sum = 0
    public static int MaximumLength(int arr[]) {
        int n = arr.length;

        // HashMap to store prefix sum and its first occurrence index
        Map<Integer, Integer> map = new HashMap<>();

        int maxLen = 0; // stores the maximum subarray length
        int sum = 0;    // cumulative sum

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add current element to cumulative sum

            // Case 1: If sum becomes 0, subarray from 0 to i has sum 0
            if (sum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: If this sum has been seen before, then subarray (previous index + 1) to i has sum 0
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // Store this sum with its index (only first occurrence)
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        int result = MaximumLength(arr);

        System.out.println("Maximum length of subarray with sum 0 is: " + result);
    }
}
