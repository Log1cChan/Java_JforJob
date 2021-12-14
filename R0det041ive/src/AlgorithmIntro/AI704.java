package AlgorithmIntro;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length  - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
}

public class AI704 {
    /**
     * @program: R0det041ive
     * @description: BinarySearch Q
     * @author: Log1c
     * @create: 2021-11-30 16:24
     **/


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(s.search(nums, target));
    }
}
