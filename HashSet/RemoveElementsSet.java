import java.util.Arrays;
import java.util.HashSet;

class RemoveElementsSet {
    public static void main(String[] args) {
        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();

        setOne.addAll(Arrays.asList(1,2,3));
        setTwo.addAll(Arrays.asList(2));

        System.out.println("The original set is: " + setOne);
        //checking if they have same element
        setOne.retainAll(setTwo);

        System.out.println("The set after removing the all elements that are not found in set two: " + setOne);
        System.out.println("Set two is: " + setTwo);

    }
}
