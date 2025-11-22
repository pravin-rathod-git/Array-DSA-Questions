import java.util.*;

public class CountSubArraySum {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);  // base prefix

        int count = 0;
        int prefix = 0;

        for (int i = 0; i < n; i++) {
            prefix += nums[i];

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3};
        int k = 3;

        int result = sol.subarraySum(nums, k);

        System.out.println("Total subarrays with sum = " + k + " → " + result);
    }
}
