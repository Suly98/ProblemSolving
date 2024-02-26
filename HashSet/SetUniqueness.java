import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SetUniqueness {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();

        numberSet.addAll(Arrays.asList(1,2,2,3,4,5,6,6));

        System.out.println(numberSet);
    }
}

