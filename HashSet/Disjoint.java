import java.util.Arrays;
import java.util.HashSet;

class Disjoint {
    public static void main(String[] args) {
        HashSet<String> setOne = new HashSet<>();
        HashSet<String> setTwo = new HashSet<>();

        setOne.addAll(Arrays.asList("Hi", "Mr", "Marhoon"));
        setTwo.addAll(Arrays.asList("I", "am", "in", "Ploto"));

        //checking if they have same element
        setOne.retainAll(setTwo);

        if (!setOne.isEmpty()) {
            System.out.println("Not Disjoint!");
        } else {
            System.out.println("Disjoint");
        }
    }
}
