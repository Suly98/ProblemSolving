import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class CountNumbers {
    public static void main(String[] args) {
        List<Integer> duplicatesNumber = new ArrayList<>();
        duplicatesNumber.addAll(Arrays.asList(1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6));

        HashSet<Integer> uniqueNumber = new HashSet<>();

        int count = 0;
//        Adding the duplicated Numbers as unique in the ser
        for (Integer number : duplicatesNumber) {
            uniqueNumber.add(number);
        }
//        Counting the numbers
        for (int unique : uniqueNumber) {
            for (int duplicate : duplicatesNumber) {
                if (unique == duplicate) {
                    count++;
                }
            }
            System.out.println(unique + " is duplicated " + count + " times");
            count = 0;
        }
    }
}

