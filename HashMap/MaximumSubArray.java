import java.util.*;


class MaximumSubArray {
    public static void main(String[] args) {
        List<Integer> path = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean cond = true;
        while (cond) {
            System.out.println("Enter numbers that you want to be in a set: (hit e to exit) ");
            String num = scanner.next();
            if (num.equalsIgnoreCase("e")) {
                cond = false;
            } else {
                path.add(Integer.valueOf(num));
            }
        }
        scanner.close();

        int maxSum = path.getFirst();
        int currentSum = 0;
        for (int x : path) {
            currentSum = currentSum + x;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            } else if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}

