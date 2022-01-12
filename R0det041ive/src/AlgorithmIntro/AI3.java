package AlgorithmIntro;

import java.util.HashSet;
import java.util.Set;

public class AI3 {
    /**
     * @program: R0det041ive
     * @description: No repeated char, longest substring
     * @author: Log1c
     * @create: 2021-12-07 23:41
     **/

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;  // len用于存放最长，tlen用于临时存储
        int anc = 0;    // 锚点，用于滑动窗口
        Set<Character> set = new HashSet<Character>();
        if(s.length()<2){
            if (s.length()==0){
                return 0;
            }else
                return 1;
        }
        for (Character c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);    // 若未出现这一字符，加入set
            }else if(set.contains(c)){
                if(set.size()>len){
                    len = set.size();
                }
                while(s.charAt(anc)!=c){
                    set.remove(s.charAt(anc));
                    anc++;
                }
                anc+=1;
            }
        }
        if(set.size()>len){
            len = set.size();
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "bbtablud";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
