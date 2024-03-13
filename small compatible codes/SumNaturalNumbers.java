import java.util.*;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        // Adding scanner to ask the user for how many numbers and printing the numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the numbers limit: ");
        int limit = scanner.nextInt();

        System.out.println("The sum of the first " + limit + " numbers is: " + sumOfNumbers(limit));

    }

    // Doing the magic:
    public static int sumOfNumbers(int n) {
        if (n == 0){
            return 0;
        }

        return sumOfNumbers(n - 1) + n;
    }
}
