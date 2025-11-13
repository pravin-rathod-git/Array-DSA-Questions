import java.util.Arrays;

public class SecondMaxDifference {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        Arrays.sort(arr);

        // Max difference = last - first
        int maxDiff = arr[arr.length - 1] - arr[0];
        // Second max difference could be between:
        // (second largest - smallest) OR (largest - second smallest)
        int secondDiff1 = arr[arr.length - 2] - arr[0];
        int secondDiff2 = arr[arr.length - 1] - arr[1];

        int secondMaxDiff = Math.max(secondDiff1, secondDiff2);
        System.out.println("Second maximum difference: " + secondMaxDiff);
    }
}
