import java.util.*;

public class ThreeSum {

    // Function to find all unique triplets in the array that sum up to zero
    public static List<List<Integer>> ThreeSumArray(int arr[]) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        // Step 1: Sort the array to easily skip duplicates and use two-pointer technique
        Arrays.sort(arr);

        // Step 2: Iterate through each element as the first element of the triplet
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements to avoid repeated triplets
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1; // left pointer
            int k = n - 1; // right pointer

            // Step 3: Use two-pointer approach to find other two elements
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    // If sum is less than zero, increase the left pointer to get a larger sum
                    j++;
                } else if (sum > 0) {
                    // If sum is greater than zero, decrease the right pointer to get a smaller sum
                    k--;
                } else {
                    // If sum == 0, we found a valid triplet
                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Move both pointers and skip duplicates
                    j++;
                    k--;

                    // Skip duplicate values for 'j'
                    while (j < k && arr[j] == arr[j - 1]) j++;

                    // Skip duplicate values for 'k'
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        // Step 4: Return the list of unique triplets
        return list;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = ThreeSumArray(arr);

        System.out.println("Unique triplets that sum to 0 are:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
