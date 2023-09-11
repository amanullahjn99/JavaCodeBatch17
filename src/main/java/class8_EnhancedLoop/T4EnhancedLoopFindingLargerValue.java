package class8_EnhancedLoop;

public class T4EnhancedLoopFindingLargerValue {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};
        int largest = nums[0];
        for (int n : nums) {
            if (n > largest) {
                largest = n;
            }
        }

        System.out.println(largest);
    }
}
