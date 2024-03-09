import java.util.*;


public class IsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;

        for (Integer x : nums) {
            for (int j = 0; j < nums.length; j++) {
                if (x.equals(nums[j])) {
                    i++;
                }
            }
            if (i > 1) {

            }
            i = 0;

        }
    }
}

