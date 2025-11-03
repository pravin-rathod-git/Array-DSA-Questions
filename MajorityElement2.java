import java.util.*;

public class MajorityElement2 {

    // Function to find elements appearing more than n/3 times
    public static List<Integer> Majority(int arr[]) {
        int n = arr.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;  // No need to initialize with min/max

        // Step 1: Find potential candidates
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) cnt1++;
            else if (arr[i] == el2) cnt2++;
            else if (cnt1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                cnt1 = 1;
            } else if (cnt2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2: Verify candidates
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) cnt1++;
            else if (arr[i] == el2) cnt2++;
        }

        // Step 3: Add valid candidates to result list
        List<Integer> list = new ArrayList<>();
        if (cnt1 > n / 3) list.add(el1);
        if (cnt2 > n / 3) list.add(el2);

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 2, 2, 2};

        List<Integer> result = Majority(arr);
        System.out.println("Majority elements (> n/3 times): " + result);
    }
}
