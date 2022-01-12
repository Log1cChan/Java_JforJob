package OfferK1ller;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {
    /**
     * @program: R0det041ive
     * @description: 数组中的重复数字
     * @author: Log1c
     * @create: 2022-01-04 20:16
     **/

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)) return i;
            set.add(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
}
