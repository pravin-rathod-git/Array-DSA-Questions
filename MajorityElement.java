public class MajorityElement {

    // Method to find the majority element using Moore's Voting Algorithm
    public static int MajorElement(int arr[]) {
        int n = arr.length;

        // Step 1: Find candidate for majority element
        int major = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == major) {
                count++;
            } else {
                count--;
                // If count becomes zero, change candidate
                if (count == 0) {
                    major = arr[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify if the candidate is actually the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == major) {
                count++;
            }
        }

        // Step 3: Return the element if it appears more than n/2 times
        if (count > n / 2) {
            return major;
        }

        // If no majority element found, return -1
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 2, 2, 2};

        int result = MajorElement(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
}
