public class RightRoatation {
    // Function to right-rotate an array by k positions
public static int[] RotateArray(int arr[], int k) {
    int n = arr.length;

    // Handle cases where k > n (rotation by full cycles)
    k = k % n;

    // Temporary array to store the last k elements
    int[] temp = new int[k];

    // Copy last k elements to temp
    for (int i = 0; i < k; i++) {
        temp[i] = arr[n - k + i];
    }

    // Shift remaining elements to the right
    for (int i = n - k - 1; i >= 0; i--) {
        arr[i + k] = arr[i];
    }

    // Copy the elements from temp[] to the beginning
    for (int i = 0; i < k; i++) {
        arr[i] = temp[i];
    }

    return arr;
}

public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50, 60};
    int k = 2; // Rotate by 2 positions

    // Rotate the array to the right
    int[] rotatedArray = RotateArray(arr, k);

    // Print rotated array elements
    System.out.println("Array after right rotation by " + k + " positions:");
    for (int i = 0; i < rotatedArray.length; i++) {
        System.out.print(rotatedArray[i] + " ");
    }
}

}
