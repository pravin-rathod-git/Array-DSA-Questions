public class RotatedSortedArray {

    // Function to check if the array is sorted and rotated
    public static boolean isRotatedSorted(int arr[]) {
        int n = arr.length;
        int count = 0; // To count how many times the ascending order breaks

        for (int i = 0; i < n; i++) {
            // (i + 1) % n ensures the last element compares with the first element
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }

            // If order breaks more than once, it's not a rotated sorted array
            if (count > 1) {
                return false;
            }
        }
        return true; // If order breaks 0 or 1 times, it's sorted and rotated
    }

    public static void main(String[] args) {
        int arr1[] = {3, 4, 5, 1, 2};   // Rotated sorted
        int arr2[] = {1, 2, 3, 4, 5};   // Sorted but not rotated
        int arr3[] = {2, 1, 3, 4, 5};   // Not sorted or rotated

        System.out.println(isRotatedSorted(arr1)); // true
        System.out.println(isRotatedSorted(arr2)); // true (technically rotation count = 0)
        System.out.println(isRotatedSorted(arr3)); // false
    }
}
