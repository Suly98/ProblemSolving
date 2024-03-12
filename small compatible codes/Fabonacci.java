import java.util.*;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the series limit: ");
        int max = scanner.nextInt();

        System.out.println("Fibonacci of this series is: ");
        for (int i = 0; i < max; i++) {
            System.out.println(fibonacci(i + 1) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
