// Function to find the missing number in a sequence from 1 to n+1
public static int MissingNumber(int arr[]) {
    int n = arr.length;  // Array contains n numbers (one missing from 1 to n+1)

    // Calculate the expected sum of numbers from 1 to n+1
    int expectedSum = (n + 1) * (n + 2) / 2;

    // Calculate the actual sum of elements in the array
    int actualSum = 0;
    for (int i = 0; i < n; i++) {
        actualSum += arr[i];
    }

    // The difference gives the missing number
    int missingNum = expectedSum - actualSum;

    return missingNum;
}

public static void main(String[] args) {
    // Example array (missing number is 6)
    int arr[] = {1, 2, 3, 4, 5, 9, 8, 7};

    // Display result
    System.out.println("Missing number: " + MissingNumber(arr));
}
