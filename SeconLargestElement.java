// Class containing the logic to find the second largest element
class Function {
    public static int SeconLargest(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;     // Initialize largest to smallest possible integer
        int secLargest = Integer.MIN_VALUE;  // Initialize second largest similarly

        for (int i = 0; i < n; i++) {
            // If current element is greater than the largest,
            // then update both largest and second largest
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }
            // If current element is smaller than largest but
            // greater than second largest, update second largest
            else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
}

// Main class to test the function
public class SeconLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 40, 50, 60, 55};

        // Call the method using the class name since it's a static method
        System.out.println("Second Largest Element: " + Function.SeconLargest(arr));
    }
}
