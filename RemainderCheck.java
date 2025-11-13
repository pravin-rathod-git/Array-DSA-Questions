public class RemainderCheck {
    public static void printNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 5 == 4)
                System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 10, 14, 19, 24, 25, 29};
        printNumbers(arr);
    }
}
