import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A string: ");

        //Removing all whitespace and special characters in the string
        // I looked this up, because there is no way I could write an if statement for all characters :)
        String str = scanner.nextLine().replaceAll("\\p{Punct}", "").replaceAll("\\s+", "");

        int strHalf = str.length() / 2;

        int m = 0;
        //Issuing an Array of the str
        String[] stringArray = new String[str.length()];

        for (Character s : str.toCharArray()) {
            stringArray[m] = s.toString();
            m++;
        }

        int endIndex = str.length()-1;
        boolean cond = true;
        for (int i = 0; i <= strHalf; i++) {
            if (stringArray[i].equalsIgnoreCase(stringArray[endIndex])){
                cond = true;
                endIndex--;
            } else {
                cond=false;
            }
        }
        System.out.println(cond);
    }
}