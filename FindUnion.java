// Function to find the union of two arrays
static ArrayList<Integer> FindUnionofArrays(int arr1[], int arr2[]) {
    int n = arr1.length;
    int m = arr2.length;

    // Sort both arrays to easily merge unique elements
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    ArrayList<Integer> union = new ArrayList<>();

    int i = 0, j = 0; // Pointers for arr1 and arr2

    // Traverse both arrays simultaneously
    while (i < n && j < m) {
        // Case 1: arr1[i] is smaller, add it if not duplicate
        if (arr1[i] < arr2[j]) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        // Case 2: arr2[j] is smaller, add it if not duplicate
        else if (arr2[j] < arr1[i]) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        // Case 3: Both are equal — add only once
        else {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
            j++;
        }
    }

    // Add remaining elements of arr1 (if any)
    while (i < n) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
            union.add(arr1[i]);
        }
        i++;
    }

    // Add remaining elements of arr2 (if any)
    while (j < m) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
            union.add(arr2[j]);
        }
        j++;
    }

    return union;
}

public static void main(String[] args) {
    int arr1[] = {1, 2, 2, 3, 4, 5};
    int arr2[] = {2, 3, 5, 6};

    // Calling function
    ArrayList<Integer> unionResult = FindUnionofArrays(arr1, arr2);

    // Display result
    System.out.println("Union of arrays: " + unionResult);
}
