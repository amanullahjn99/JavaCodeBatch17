package class8_EnhancedLoop;

public class T5EnhancedLoopPrintAllEvenValue {/*

 */

    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 20) {
                nums[i] = 0;
            }
        }
        System.out.println(nums);
    }
}

