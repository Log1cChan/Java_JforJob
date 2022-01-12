package AlgorithmIntro;

public class AI680 {
    /**
     * @program: R0det041ive
     * @description: 验证回文字符串
     * @author: Log1c
     * @create: 2021-12-18 17:37
     **/

    public static boolean validPalindrome(String s) {
        for(int i = 0, j = s.length()-1; i<j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j-1)||isPalindrome(s, i+1, j);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }
}
