package AlgorithmIntro;



public class AI35 {
    private static int[] nums = {1, 3, 5, 6};
    private static int target = 0;
    /**
     * @program: R0det041ive
     * @description: Search insert pos
     * @author: Log1c
     * @create: 2021-12-01 16:13
     **/

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        return right+1;
    }

    public static void main(String[] args) {
        AI35 a = new AI35();
        System.out.println(a.searchInsert(nums, target));
    }
}
