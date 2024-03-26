/* A Java program to find the duplicate
    number in a given list
*/

import java.util.*;

public class ReverseStringSorting {
    public static void main(String[] args) {

        String[] s = {"Z", "d", "c", "E", "A"};

        sortString(s);

        System.out.println(Arrays.toString(s));
    }

    public static void sortString(String[] sortedString) {
        int length = sortedString.length;

        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (sortedString[j].compareTo(sortedString[index]) > 0) {
                    index = j;
                }
            }
            String temporary = sortedString[index];
            sortedString[index] = sortedString[i];
            sortedString[i] = temporary;

        }

    }

}