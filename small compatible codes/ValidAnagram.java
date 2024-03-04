import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine().toLowerCase();

        System.out.println("Enter another string to check: ");
        String t = scanner.nextLine().toLowerCase();

        char originalStringArray[] = s.toCharArray();
        char otherStringArray[] = t.toCharArray();

        Arrays.sort(originalStringArray);
        Arrays.sort(otherStringArray);

        System.out.println(Arrays.toString(originalStringArray));
        System.out.println(Arrays.toString(otherStringArray));

        if (Arrays.toString(originalStringArray).equals( Arrays.toString(otherStringArray))){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}