package AlgorithmIntro;

public class AI189 {
    /**
     * @program: R0det041ive
     * @description: Rotate the array
     * @author: Log1c
     * @create: 2021-12-01 21:17
     **/

    public void rotate(int[] nums, int k) {
//        int[] result = new int[nums.length];
//        for(int i=0; i<nums.length; i++){
//            result[(i+k)%nums.length] = nums[i];
//        }

        int count = 0;
        int n = nums.length;
        int i = 0;
        while(count<n){
            int temp = nums[(i+k)%n];
            nums[(i+k)%n] = nums[i];
            i = (i+k)%n;
            nums[i] = temp;
            count++;
        }

        for (int j=0; j<n; j++){
            System.out.println(nums[j]);
        }


    }

    public static void main(String[] args) {
        int[] nums = {-1, 100, 3, 99};
        int k = 2;
        AI189 a = new AI189();
        a.rotate(nums, k);
    }
}
