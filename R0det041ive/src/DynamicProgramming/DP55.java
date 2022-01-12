package DynamicProgramming;

public class DP55 {
    /**
     * @program: R0det041ive
     * @description: 跳跃游戏
     * @author: Log1c
     * @create: 2021-12-23 01:50
     **/

    public static boolean canJump(int[] nums){
        int n = nums.length;    // 最后要到达n-1
//        边界情况
       int max = 0;
       for(int i=0; i<n; i++){
           if(i<=max){
               max = Math.max(max, i+nums[i]);
               if(max>=n-1){
                   return true;
               }
           }
       }
        return false;
    }

    public static void main(String[] args) {
        int[] nums =  {2,0,0};//{2, 3, 1, 1, 4};
//        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
