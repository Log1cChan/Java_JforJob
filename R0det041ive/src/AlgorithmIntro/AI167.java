package AlgorithmIntro;

public class AI167 {
    /**
     * @program: R0det041ive
     * @description: Sum of 2 nums
     * @author: Log1c
     * @create: 2021-12-06 19:07
     **/
    public static int[] twoSum(int[] numbers, int target) {


//        Solution 1:
//        for(int i=0; i<numbers.length; i++){
//            if(numbers[i]<=target){
//                for(int j=i+1; j<numbers.length; j++){
//                    if (numbers[i]+numbers[j]==target){
//                        result[0] = i+1;
//                        result[1] = j+1;
//                        break;
//                    }
//                }
//            }
//        }

//        Solution 2:
        int n = numbers.length;
        int left=0, right=n-1;
        while(right>=left){
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            if(numbers[left] + numbers[right] < target){
                left++;
            }
            if(numbers[left] + numbers[right] == target){
                break;
            }
        }
        return new int[]{left+1, right+1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

}
