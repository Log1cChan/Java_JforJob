package AlgorithmIntro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AI524 {
    /**
     * @program: R0det041ive
     * @description: 通过删除字母匹配到字典里最长单词
     *               返回长度最长且字母序最小的字符串
     * @author: Log1c
     * @create: 2021-12-19 01:10
     **/

    public static String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String str:dictionary){
            int p1 = 0, p2 = 0;
            while(p1<s.length()){
                if(s.charAt(p1) == str.charAt(p2)){
                    if(p2==str.length()-1){
                        if(str.length()>res.length() ||(str.length() == res.length() && str.compareTo(res)<0)){
                            res = str;
                            break;
                        }else{
                            break;
                        }
                    }else{
                        p1++; p2++;
                    }
                }else{
                    p1++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");
        String s = "abpcplea";
        System.out.println(findLongestWord(s, dictionary));
    }
}
