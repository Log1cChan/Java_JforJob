package AlgorithmIntro;

public class AI344 {
    /**
     * @program: R0det041ive
     * @description: Reverse the string
     * @author: Log1c
     * @create: 2021-12-07 16:08
     **/
    public static void reverseString(char[] s) {
        int left=0, right=s.length-1;
        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
