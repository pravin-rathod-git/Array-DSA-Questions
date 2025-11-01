public class Sort012s {

    // Method to sort an array containing only 0s, 1s, and 2s
    public static int[] SortArray(int arr[]) {
        int n = arr.length;
        int low = 0;       // Points to the next position for 0
        int mid = 0;       // Current element
        int high = n - 1;  // Points to the next position for 2

        // Dutch National Flag Algorithm
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // No swap needed, just move mid
                mid++;
            } else { // arr[mid] == 2
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr; // Return the sorted array
    }

    // Main method for testing
    public static void main(String[] args) {
        int arr[] = {2, 0, 1, 2, 1, 0, 0, 2};

        System.out.println("Original Array:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        int sorted[] = SortArray(arr);

        System.out.println("Sorted Array:");
        for (int num : sorted)
            System.out.print(num + " ");
    }
}
