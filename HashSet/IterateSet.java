import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IterateSet {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.addAll(Arrays.asList("Banana", "Apple", "Cherry"));

        for (String str : fruitSet) {
            System.out.println(str);
        }
    }
}

