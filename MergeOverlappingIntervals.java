import java.util.*;

public class MergeOverlappingIntervals {

    // Function to merge all overlapping intervals
    public static List<List<Integer>> Merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Create a list to store merged intervals
        List<List<Integer>> merged = new ArrayList<>();

        // Step 3: Traverse all intervals
        for (int[] interval : intervals) {

            // Case 1: If merged list is empty OR current interval does not overlap with the last one
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval[0]) {
                // Add the new interval as a separate entry
                merged.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // Case 2: Overlapping intervals → merge them
                int last = merged.size() - 1;
                int maxEnd = Math.max(merged.get(last).get(1), interval[1]);

                // Update the end of the last merged interval
                merged.get(last).set(1, maxEnd);
            }
        }

        // Step 4: Return the merged intervals
        return merged;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Sample input: some overlapping intervals
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // Call the merge function
        List<List<Integer>> result = Merge(intervals);

        // Print the merged intervals
        System.out.println("Merged Intervals:");
        for (List<Integer> interval : result) {
            System.out.println(interval);
        }
    }
}
