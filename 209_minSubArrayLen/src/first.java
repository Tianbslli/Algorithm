/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/7/28 10:54 下午
 */
public class first {

    static class Solution {
        public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sums = {2,3,1,2,4,3};
        int ans = solution.minSubArrayLen(7,sums);

    }


}
