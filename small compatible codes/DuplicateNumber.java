import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class DuplicateNumber {
    public static void main(String[] args) {

        // Opennin a scanner
        Scanner scanner = new Scanner(System.in);

        //Creating ArrayList and HashSet
        ArrayList<Integer> numberArray = new ArrayList<>();
        HashSet<Integer> numberSet = new HashSet<>();


        Boolean cond = true;

        //This code will get the integers inside the ArrayList
        while (cond) {
            System.out.println("Please Enter a number: hit " +
                    "f to finish");
            String num = scanner.next();

            if (num.equalsIgnoreCase("f")) {
                cond = false;
                break;
            } else {
                numberArray.add(Integer.valueOf(num));
                numberSet.add(Integer.valueOf(num));    // this code will enter the integers inside the hashset
            }
        }
        scanner.close();


        // this part will look for the duplicate number and return it!
        int count = 0;
        for (Integer x : numberSet) {
            for (Integer y : numberArray) {
                if (x == y){
                    count++;
                    if (count == 2){
                        System.out.println(x);
                        break;
                    }
                }
            }
            count = 0;
        }
    }
}