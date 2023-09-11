package class8_EnhancedLoop;

public class E4EnhancedLoopFindingBigggerValue {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};
        int count = 0;
        for (int t : nums) {
            if (t > 20) {
                count++;
            }
        }
        System.out.println(count);
    }
}
