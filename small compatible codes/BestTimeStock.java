import java.util.*;


public class BestTimeStock {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3, 5, 1, 7, 4, 9));


        int min = numbers.get(0); // the first value on the ArraysList
        int count = 0;

        //Getting the minimum value in the list:
        for (int days = 0; days < numbers.size(); days++) {
            count = count + numbers.get(days);
            if (count < min) {
                min = count;
            } else {
                count = 0;
            }
        }
//            // going on a for loop to get the highest price on the day:
        int leastPriceDay = numbers.indexOf(min);
        int max = numbers.get(min);

        for (int j = leastPriceDay; j < numbers.size(); j++) {
            count = count + numbers.get(j);
            if (count > max) {
                max = count;
            }
            count = 0;
        }
        System.out.println(max - min);
    }
}

