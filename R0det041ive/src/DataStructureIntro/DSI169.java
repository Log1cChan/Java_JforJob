package DataStructureIntro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DSI169 {
    /**
     * @program: R0det041ive
     * @description: 多数元素
     * @author: Log1c
     * @create: 2021-12-20 16:11
     **/

    public static int majorityElement(int[] nums) {
//        hashset method
//        int n = nums.length;
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for(Integer i : nums){
//            Integer count = map.get(i);
//            map.put(i, count == null ? 1 : ++count);
//        }
//        for(Integer i : map.keySet()){
//            if(map.get(i)>n/2){
//                return i;
//            }
//        }
//        return -1;

//        Sort then
        Arrays.sort(nums);
        int n = nums.length;
        int temp = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(temp == nums[i]){
                count++;
            }
            if(temp != nums[i]){
                if(count > n/2){
                    return temp;
                }else{
                    temp = nums[i];
                    count = 1;
                }
            }
        }
        return nums[n-1];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
