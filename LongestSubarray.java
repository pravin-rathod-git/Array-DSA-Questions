import java.util.*;

public class LongestSubarray {

    // Function to find the length of the longest subarray having sum equal to k
    public static int SubArraySum(int arr[], int k) {
        int n = arr.length;
        int maxLen = 0; // Stores the maximum length of subarray found
        Map<Integer, Integer> map = new HashMap<>(); // Stores prefix sum and its earliest index

        int sum = 0; // Cumulative prefix sum
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Update the running sum

            // Case 1: If current sum equals k, the subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: Check if there exists a prefix sum (sum - k)
            // If yes, then the subarray between that index + 1 and current index has sum k
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: Store the prefix sum only if it’s not already present
            // (to ensure the smallest index is stored)
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen; // Return the maximum subarray length found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        // Call the function and display result
        int result = SubArraySum(arr, k);
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);

        sc.close();
    }
}
