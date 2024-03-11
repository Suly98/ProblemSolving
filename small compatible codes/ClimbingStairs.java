public class ClimbingStairs {
    public static void main(String[] args) {
        int s = climbingStairs(6);
        System.out.println(s);
    }

    public static int climbingStairs(int n) {
        if (n <= 3) {
            return n;
        } else {
            return climbingStairs(n - 1) + climbingStairs(n - 2);
        }
    }
}








