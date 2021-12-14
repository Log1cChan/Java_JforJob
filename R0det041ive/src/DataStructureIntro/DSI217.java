package DataStructureIntro;

import java.util.Arrays;

public class DSI217 {
    /**
     * @program: R0det041ive
     * @description: If exist repeated element
     * @author: Log1c
     * @create: 2021-12-01 22:13
     **/
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        DSI217 d = new DSI217();
        System.out.println(d.containsDuplicate(nums));
    }

}
