import java.util.Arrays;
import java.util.HashSet;

class IntersectionSet {
    public static void main(String[] args) {
        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();

        setOne.addAll(Arrays.asList(1,2,3,4));
        setTwo.addAll(Arrays.asList(4,5,6,7));

        //Mixing the two sets' duplicated numbers
        setOne.retainAll(setTwo);

        System.out.println(setOne);
    }
}
