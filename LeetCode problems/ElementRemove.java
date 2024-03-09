import java.util.*;


public class ElementRemove {
    public static void main(String[] args) {

    }

    public int removeElement(Integer[] nums, int val){

        Integer i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
                i.
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}

