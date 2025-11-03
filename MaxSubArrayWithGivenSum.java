import java.util.HashMap;

public class MaxSubArrayWithGivenSum {

    // Function to count subarrays with sum = k
    public static int countSubArrays(int arr[], int k) {
        int n = arr.length;
        int count = 0;
        int prefixSum = 0;

        // HashMap to store frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Case 1: The whole array up to current index sums to k
            if (prefixSum == k) {
                count++;
            }

            // Case 2: There exists a previous prefix sum that makes current subarray sum = k
            int rem = prefixSum - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);  // Add number of times that prefixSum appeared
            }

            // Store/update prefixSum count in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -1, 1, 2};
        int k = 3;

        int result = countSubArrays(arr, k);
        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}
