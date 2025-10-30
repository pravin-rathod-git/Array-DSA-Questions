// Method to remove duplicates from a sorted array in-place
public static int RemoveDuplicatesFromArray(int arr[]) {
    int n = arr.length;

    // Pointer 'i' will track the index of the last unique element
    int i = 0;

    // Loop through the array starting from the second element
    for (int j = 1; j < n; j++) {
        // If current element is different from the last unique one
        if (arr[i] != arr[j]) {
            i++;            // Move 'i' forward
            arr[i] = arr[j]; // Copy current unique element to position i
        }
    }

    // Return count of unique elements (index + 1)
    return i + 1;
}

public static void main(String[] args) {
    int arr[] = {10, 20, 20, 30, 40, 50, 60, 70, 70};

    // Call the method and get the count of unique elements
    int k = RemoveDuplicatesFromArray(arr);

    // Print all unique elements
    System.out.println("Array after removing duplicates:");
    for (int i = 0; i < k; i++) {
        System.out.println(arr[i]);
    }
}
