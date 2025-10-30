// Function to left-rotate an array by k positions
public static int[] RotateArray(int arr[], int k) {
    int n = arr.length;

    // Handle cases where k > n (e.g., rotate by 8 when array length is 6)
    k = k % n;

    // Temporary array to store first k elements
    int[] temp = new int[k];

    // Copy first k elements to temp
    for (int i = 0; i < k; i++) {
        temp[i] = arr[i];
    }

    // Shift remaining elements to the left
    for (int i = k; i < n; i++) {
        arr[i - k] = arr[i];
    }

    // Copy the elements from temp[] to the end
    for (int i = 0; i < k; i++) {
        arr[n - k + i] = temp[i];
    }

    return arr;
}

public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50, 60};
    int k = 3;

    // Rotate the array to the left by k positions
    int[] rotatedArray = RotateArray(arr, k);

    // Print rotated array elements
    System.out.println("Array after left rotation by " + k + " positions:");
    for (int i = 0; i < rotatedArray.length; i++) {
        System.out.print(rotatedArray[i] + " ");
    }
}
