import java.util.*;

public class ArrangePosNeg {
    public static int[] Arrange(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num < 0) neg.add(num);
            else pos.add(num);
        }

        int i = 0, j = 0, k = 0;
        int[] res = new int[n];

        // Alternate placement
        while (i < neg.size() && j < pos.size()) {
            res[k++] = neg.get(i++);
            res[k++] = pos.get(j++);
        }

        // If negatives remain
        while (i < neg.size()) {
            res[k++] = neg.get(i++);
        }

        // If positives remain
        while (j < pos.size()) {
            res[k++] = pos.get(j++);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, -5, 6, 7};
        int res[] = Arrange(arr);

        System.out.println(Arrays.toString(res));
    }
}
