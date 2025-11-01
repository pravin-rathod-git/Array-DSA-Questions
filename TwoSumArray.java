import java.util.*;

public class TwoSumArray {

    // Method to find indices of two numbers that add up to a given target (k)
    public static int[] TwoSum(int arr[], int k) {
        int n = arr.length;

        // HashMap to store array elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Calculate the remaining value needed to reach target 'k'
            int rem = k - arr[i];

            // Check if the remaining value already exists in the map
            // If it does, we found a pair that adds up to 'k'
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i}; // Return indices of the two numbers
            }

            // Store the current number with its index in the map
            map.put(arr[i], i);
        }

        // Return an empty array if no pair is found
        return new int[]{};
    }

    // Main method to test the TwoSum method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum: ");
        int k = sc.nextInt();

        // Call the TwoSum method
        int result[] = TwoSum(arr, k);

        // Display the result
        if (result.length == 2) {
            System.out.println("Indices of elements that sum to " + k + " are: " + result[0] + " and " + result[1]);
            System.out.println("Elements are: " + arr[result[0]] + " and " + arr[result[1]]);
        } else {
            System.out.println("No two elements found with sum = " + k);
        }

        sc.close();
    }
}
