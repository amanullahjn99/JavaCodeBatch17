package class8;

public class T5EnhancedLoopFindLargesEvenValue {/*
Find the largest even number
*/

    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 57, 60, 20};
        int largestEven = nums[0];
        for (int d : nums) {
            if (d > largestEven && d % 2 == 0) {
                largestEven = d;
            }
        }
        System.out.println(largestEven);
    }
}

