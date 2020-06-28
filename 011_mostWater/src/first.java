/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/6/27 9:10 下午
 */
public class first {
    public int maxArea(int[] height) {
        if(height == null || height.length <= 2){
            return 0;
    }
        int left = 0,right = height.length -1;
        int max = (right - left) * (height[left] > height[right] ? height[right]:height[left]);
        while(left<right){
            if(height[left] > height[right]){
                right--;
            }else
            {
                left++;
            }
            if((right - left) * (height[left] > height[right] ? height[right]:height[left]) > max){
                max = (right - left) * (height[left] > height[right] ? height[right]:height[left]);
            }
        }
        return max;
    }
}
