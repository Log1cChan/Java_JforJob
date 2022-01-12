package DataStructureIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSI15 {
    /**
     * @program: R0det041ive
     * @description: 三数之和
     * @author: Log1c
     * @create: 2021-12-20 16:37
     **/

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        if(nums.length<=2){
            return list;
        }
        Arrays.sort(nums);
        for(int left=0; left<nums.length&&nums[left]<=0; left++){
            int mid = left+1;
            int right = nums.length-1;
            while(mid < right){
                if(nums[left]+nums[mid]+nums[right]>0){
                    right--;
                }else if(nums[left]+nums[mid]+nums[right]<0){
                    mid++;
                }else{
                    List<Integer> res = Arrays.asList(nums[left], nums[mid], nums[right]);
                    if (!list.contains(res)){
                        list.add(res);
                    }
                    mid++;right--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        List<List<Integer>> list = new ArrayList();
        list = threeSum(nums);
        System.out.println(list);

    }
}
