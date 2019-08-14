public class Solution1 implements Solution {
    @Override
    public int climbStairs(int n) {

        int[] steps = new int[n+1];
        steps[0] = 1;
        for (int i = 1; i < steps.length; i++) {
            if (i == 1) {
                steps[i] = 1;
            } else {
                steps[i] = steps[i-1]+steps[i-2];
            }
        }

        return steps[n];
    }
}
