import java.util.Arrays;

/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/6/27 9:32 下午
 */
public class first {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 1000000;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return target;
                }
                else if(sum > target){
                    k--;
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else {
                    j++;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
                if(Math.abs(sum - target) < Math.abs(min - target)){
                    min = sum;
                }
            }
        }
        return min;

    }
}
