package class8_EnhancedLoop;

public class T7EnhancedLoopSmalestValue {/*
/* go throught the array and replace all the negative numbers with 0
 */

    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 45, 60, 20, -10, -5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;

            }
        }
        for (int num : nums) {
            System.out.println(num);

        }
    }
}

