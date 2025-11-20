public class ClockAngle {
    public static int findAngle(int H, int M) {
        double hourAngle = 30 * H + 0.5 * M;
        double minuteAngle = 6 * M;

        double diff = Math.abs(hourAngle - minuteAngle);
        return (int)Math.min(diff, 360 - diff);
    }

    public static void main(String[] args) {
        System.out.println(findAngle(3, 30)); // 75
        System.out.println(findAngle(9, 0));  // 90
        System.out.println(findAngle(12, 45)); // 112
    }
}
