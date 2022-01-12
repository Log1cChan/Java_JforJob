package Sorting;

public class HeapSort {
    /**
     * @program: CS-Notes
     * @description: 堆排序
     * @author: Log1c
     * @create: 2021-12-22 17:27
     **/

    public static void heapSort(int[] nums){
        int n = nums.length;
//        构造初始大顶堆
        for(int k=n/2; k>=0; k--){
            sink(nums, k, n);
        }
//        与数组最后一元素交换并删除最大元素后继续构造堆
        while(n>0){
            swap(nums, 0, --n);
            sink(nums, 0, n);
        }
    }

    public static void sink(int[] nums, int k, int n){
//      判断是否满足一个堆
        while(2*k+2<=n){
//          选择父节点k的子节点j
            int j = 2*k+1;
//          比较子节点，选最大的
            if(j+1<n && nums[j]<nums[j+1]){
                j++;
            }
//          如果父节点大于子节点最大值，满足要求，无需交换
            if(nums[k] > nums[j]){
                break;
            }
//          不满足，交换
            swap(nums, k, j);
//          此时令当前节点为父节点，继续下沉判断
            k = j;
        }
    }





    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
//        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6};
        int[] nums = {2,4,1,0,3,5};
        heapSort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
