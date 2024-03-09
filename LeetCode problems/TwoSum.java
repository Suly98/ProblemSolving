import java.util.*;


class TwoSum {
    public static void main(String[] args) {
        HashSet<Integer> cond = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        int[] nums = {3,3};
        int target = 6;
        int count = 0;
        for(int i = 0; i<=nums.length ; i++){

            if (nums[i]+nums[i+1] == target){
                cond.add(i);
                cond.add(i+1);
                break;
            }

        }
        System.out.println(cond);
    }
}

