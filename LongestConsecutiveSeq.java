import java.util.*;

public class LongestConsecutiveSeq {

    // Function to find the length of the longest consecutive sequence
    public static int LongestCon(int arr[]) {
        int n = arr.length;

        // If array is empty, return 0
        if (n == 0) return 0;

        // Step 1: Store all elements in a HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 1; // To store the length of the longest sequence

        // Step 2: Traverse through the set
        for (int num : set) {

            // Check if 'num' is the starting point of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int cnt = 1;

                // Count all consecutive numbers after 'num'
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    cnt++;
                }

                // Update the longest sequence length
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};

        // Call the function
        int result = LongestCon(arr);

        // Print the result
        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
