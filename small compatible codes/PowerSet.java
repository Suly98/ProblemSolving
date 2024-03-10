import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of the elements in the list: ");
        Integer elements = scanner.nextInt();

        System.out.println("Enter the numbers that you want: ");
        int[] nums = new int[elements];
        for (int i = 0; i < elements; i++) {
            nums[i] = scanner.nextInt();
        }

        HashSet<HashSet<Integer>> mainSet = new HashSet<>();
        mainSet.add(new HashSet<>());

        for (int i : nums) {
            HashSet<HashSet<Integer>> current = new HashSet<>();
            for (HashSet j : mainSet) {
                HashSet<Integer> temp = new HashSet<>(j);
                temp.add(i);
                current.add(temp);
            }
            mainSet.addAll(current);
        }
        System.out.println(mainSet);
    }

}












