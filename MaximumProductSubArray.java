// Problem: Maximum Product Subarray
// Approach: Prefix and Suffix Product Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        int pre = 1;    // Prefix product (from start)
        int suff = 1;   // Suffix product (from end)
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;  // Track maximum product found

        // Traverse once, calculating both prefix and suffix products
        for (int i = 0; i < n; i++) {
            pre *= nums[i];           // Multiply prefix product
            suff *= nums[n - i - 1];  // Multiply suffix product

            // Update maximum product using both directions
            maxProduct = Math.max(maxProduct, Math.max(pre, suff));

            // If product becomes zero, reset (since zero breaks continuity)
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
        }

        // No need for overflow checks because product remains within int range 
        // as per problem constraints, but included for safety:
        if (maxProduct > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (maxProduct < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return maxProduct;
    }

    // Example usage for testing
    public static void main(String[] args) {
        
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
        // Output: 6  (subarray [2, 3])
    }
}
