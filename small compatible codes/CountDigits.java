import java.util.*;

public class CountDigits {
    public static int count = 0;

    public static void main(String[] args) {

//      asking the user to enter a nmuber to know its digits..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get its digits: ");
        int num = scanner.nextInt();
        System.out.println(sumOfNumbers(num));
    }

    // Doing the magic:
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return sumOfNumbers(n);
        }

        sumOfNumbers(n / 10);
        count++;
        return count;
    }
}
