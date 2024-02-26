import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ElementRemove {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();

        numberSet.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("The set is "+numberSet);
        numberSet.remove(3);

        System.out.println("The set after removing (3) is: " + numberSet);
    }
}

