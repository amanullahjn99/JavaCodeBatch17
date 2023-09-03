package class8;

public class T6EnhancedLoopSmalestValue {/*

 */

    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 45, 60, 20, -10, -5};
        int smallest = nums[0];
        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
        }
        System.out.println(smallest);

    }
}

