import java.util.Arrays;
import java.util.HashSet;

class CloneSet {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.addAll(Arrays.asList(1, 2, 3, 4, 4, 4, 5));


        HashSet<Integer> numberSetCopy = (HashSet<Integer>) numberSet.clone();


        numberSetCopy.remove(1);

        System.out.println("The original set is: " + numberSet);
        System.out.println("The copied set is: " + numberSetCopy);
    }
}
