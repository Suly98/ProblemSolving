import java.util.HashSet;
import java.util.Scanner;

class FirstRecurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting the input from the user:
        System.out.println("Enter a Word/Sentence: ");
        String str = scanner.nextLine().trim();

        //Issuing the hashSet
        HashSet<String> noteBook = new HashSet<>();

        boolean cond = false;

        //adding the strings into the notebook
        for (Character x : str.toCharArray()) {
            if (noteBook.contains(x.toString())) {
                cond = true;
                System.out.print(x);
                break;
            } else if (!noteBook.contains(x.toString())) {
                noteBook.add(x.toString());
            } else if (cond == false){
                System.out.println("No repeating characters.");
            }

        }
    }
}

