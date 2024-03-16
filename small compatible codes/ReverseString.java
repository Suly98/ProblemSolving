import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

//      asking the user to enter a nmuber to know its digits..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word! ");
        String word = scanner.nextLine();
        System.out.println(stringReverse(word));
    }

    // Doing the magic:
    public static int count = 0;
    public static String stringReverse(String word) {
        if (word.isEmpty()){
            return word;
        }

        return stringReverse(word.substring(1)) + word.charAt(0);
    }
}
