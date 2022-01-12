package AlgorithmIntro;

public class AI88 {
    /**
     * @program: R0det041ive
     * @description: 合并两个有序数组
     * @author: Log1c
     * @create: 2021-12-18 18:08
     **/

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1;
        int total = m+n-1;
        while(p1>=0||p2>=0){
            if(p1 < 0){
                nums1[total--] = nums2[p2--];
            }else if(p2 < 0){
                nums1[total--] = nums1[p1--];
            }else if(nums1[p1] > nums2[p2]){
                nums1[total--] = nums1[p1--];
            }else{
                nums1[total--] = nums2[p2--];
            }
        }

        for (int num : nums1){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3, n=3;
        merge(nums1, 3, nums2, 3);
    }
}
