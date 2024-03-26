/* A Java program to find the duplicate
    number in a given list
*/

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IV";

        System.out.println(romanInt(s));

    }

    public static int romanInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                ans = ans - roman.get(s.charAt(i));
            } else {
                ans = ans + roman.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static int repeated(Integer[] nums) {
        List<Integer> newNum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (!newNum.contains(nums[i])) {
                newNum.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return 0;
    }
}