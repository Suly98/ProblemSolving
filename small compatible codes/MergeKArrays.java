import java.util.*;

public class MergeKArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> mainList = new ArrayList<>();

        System.out.println("Enter the number of List in the main Set: ");
        Integer listsElements = scanner.nextInt();

        System.out.println("Enter the numbers you want in a list followed by Enter! ");

        //adding the integers in the lists:
        for (Integer nums = 0; nums < listsElements; nums++) {
            List<Integer> currentList = new ArrayList<>();
            Integer currentNum = scanner.nextInt();

            for (int e = String.valueOf(currentNum).length() - 1; e >= 0; e--) {
                int nextVar = currentNum % 10;
                currentList.add(nextVar);
                currentNum = currentNum / 10;
            }
            mainList.add(currentList);
        }

        List<Integer> mergedList = new ArrayList<>();
        for (List<Integer> l : mainList) {
            for (Integer i : l) {
                mergedList.add(i);
            }
        }
        Collections.sort(mergedList);
        System.out.println(mergedList);
    }

}