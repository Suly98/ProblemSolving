import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ElementPresence {
    public static void main(String[] args) {
        Set<String> numberSet = new HashSet<>();

        numberSet.addAll(Arrays.asList("John", "Adam", "Joseph", "David"));

        if (numberSet.contains("John")) {
            System.out.println("found John");
        } else {
            System.out.println("John is not there!");
        }
    }
}

