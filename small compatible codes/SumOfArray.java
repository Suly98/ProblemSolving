import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>();
        ArrayList<Integer> countArray = new ArrayList<>();
        boolean cond = true;

        //creating a loop to save the input given to a new Array!
        while (cond) {
            System.out.println("Enter numbers that you want to be in a set: (hit e to exit) ");
            String num = scanner.next();
            if (num.equalsIgnoreCase("e")) {
                cond = false;
            } else {
                numberArray.add(Integer.valueOf(num));
            }
        }
        scanner.close();

        Integer count = 0;
//        creating another loop to count the sum of the numbers in the first loop
        for (Integer x : numberArray) {
            count = x + count;
            countArray.add(count);
        }
        System.out.println(countArray);
    }
}