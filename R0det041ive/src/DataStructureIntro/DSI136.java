package DataStructureIntro;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class DSI136 {
    /**
     * @program: R0det041ive
     * @description: 只出现一次的数字
     * @author: Log1c
     * @create: 2021-12-20 15:51
     **/

    public static int singleNumber(int[] nums) {
//        方法一： 先排序 再遍历
//        Arrays.sort(nums);
//        for (int i=0; i<nums.length-1; i+=2){
//            if(nums[i] != nums[i+1]){
//                return(nums[i]);
//            }
//        }
//        return nums[nums.length-1];

//        方法二： 异或
//        int single = 0;
//        for (int num : nums) {
//            single ^= num;
//        }
//        return single;

//        方法三：hashmap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i : nums){
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for(Integer i : map.keySet()){
            Integer count = map.get(i);
            if(count == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
