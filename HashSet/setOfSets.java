import java.util.Arrays;
import java.util.HashSet;

class setOfSets {
    public static void main(String[] args) {
        HashSet<HashSet<Integer>> mainSet = new HashSet<>();


        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.addAll(Arrays.asList(1,2,3,4,5));

        HashSet<Integer> numberSetTwo = new HashSet<>();
        numberSetTwo.addAll(Arrays.asList(10,20,30,40,50));

        mainSet.add(numberSet);
        mainSet.add(numberSetTwo);

        System.out.println("The main set that contains the two sets is: " + mainSet);
    }
}
