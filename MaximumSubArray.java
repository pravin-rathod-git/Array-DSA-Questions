public class MaximumSubArray {

    // Method to find maximum subarray sum using Kadane's Algorithm
    public static int MaxSum(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // Stores the maximum subarray sum found so far
        int sum = 0; // Current subarray sum

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Add current element to sum
            maxSum = Math.max(maxSum, sum); // Update maxSum if needed

            // If sum becomes negative, reset to 0
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = MaxSum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

