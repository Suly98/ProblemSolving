import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortSelection {

    public static void main(String[] args) {
        List<Integer> toBeSorted = new ArrayList<>();
        toBeSorted.addAll(Arrays.asList(4, 3, 1, 2, 7, 9)); //Insert the numbers here!

        sortSelection(toBeSorted);
    }

    private static void sortSelection(List<Integer> toBeSorted) {
        int length = toBeSorted.size();

        //(4,3,1,2)
        for (int i = 0; i < length; i++) {
            int current = toBeSorted.get(i);
            int index = i;

            for (int j = i + 1; j < length; j++) {
                if (toBeSorted.get(j) < current) {
                    current = toBeSorted.get(j);
                    index = j;
                }
            }
            int temp = toBeSorted.get(i);
            //swapping the least element
            if (index != i) {
                toBeSorted.set(i, toBeSorted.get(index));
                toBeSorted.set(index, temp);
            }
        }
        System.out.println(toBeSorted);
    }
}

