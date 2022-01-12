package AlgorithmIntro;

import java.util.Arrays;
import java.util.HashSet;

public class AI345 {
    /**
     * @program: R0det041ive
     * @description: 反转字符串中的元音字母
     * @author: Log1c
     * @create: 2021-12-17 22:14
     **/
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
//        String vowel = "aeiouAEIOU";
//        char[] reverse = s.toCharArray();
//        int left=0, right=reverse.length-1;
//        while (left<right){
//            if(vowel.indexOf(reverse[left])!=-1 && vowel.indexOf(reverse[right])!=-1){
//                char temp = reverse[right];
//                reverse[right] = reverse[left];
//                reverse[left] = temp;
//                left++;
//                right--;
//            }
//            if(vowel.indexOf(reverse[left])==-1){
//                left++;
//            }
//            if(vowel.indexOf(reverse[right])==-1){
//                right--;
//            }
//
//        }
//        return new String(reverse);
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                result[i++] = ci;
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);

    }

    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }
}
