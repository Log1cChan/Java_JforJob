package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    /**
     * @program: CS-Notes
     * @description: 实现桶排序
     * @author: Log1c
     * @create: 2021-12-23 01:37
     **/


    public static void bucketSort(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//      计算最大值与最小值
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        
//      计算桶的数量
        int bucketNum = (max-min)/n + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i=0; i<bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }
        
//      将每个元素放进桶
        for(int i=0; i<n; i++){
            int num =(nums[i]-min) / n;
            bucketArr.get(num).add(nums[i]);
        }
        
//      对每个桶进行排序
        for(int i=0; i<bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }
        
//      将桶中的元素赋值到原序列
        int index = 0;
        for(int i=0; i<bucketArr.size(); i++){
            for(int j=0; j<bucketArr.get(i).size(); j++){
                nums[index++] = bucketArr.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
//        int[] nums = {1, 2, 3, 4};
        bucketSort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
