import java.util.Arrays;
import java.util.HashSet;

class setUnion {
    public static void main(String[] args) {
        HashSet<Integer> setOne = new HashSet<>();
        setOne.addAll(Arrays.asList(-1,0,1,2));

        HashSet<Integer> setTwo = new HashSet<>();
        setTwo.addAll(Arrays.asList(1,2,3,4,5));

        HashSet<Integer> setThree = new HashSet<>();
        setThree.addAll(Arrays.asList(5,6,7,8));

        setOne.addAll(setTwo);
        setOne.addAll(setThree);
        System.out.println(setOne);
    }
}
