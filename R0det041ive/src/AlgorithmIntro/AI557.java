package AlgorithmIntro;

public class AI557 {
    /**
     * @program: R0det041ive
     * @description: Reverse the words inside the string
     * @author: Log1c
     * @create: 2021-12-07 16:16
     **/
    public static String reverseWords(String s){

//        Solution 1:
//        char[] re = s.toCharArray();
//        int left = 0, right = 0;
//        while(right<re.length) {
//            while (right + 1 < re.length && re[right + 1] != ' ') {
//                right++;
//            }
//            int tl = left, tr = right;
//            while (tl < tr) {
//                char temp = re[tl];
//                re[tl] = re[tr];
//                re[tr] = temp;
//                tl++;
//                tr--;
//            }
//            right += 2;
//            left = right;
//        }
//        return new String(re);

//      Solution 2(Slower):
        String[] sp = s.split(" ");
        s="";
        for(int i=0; i<sp.length; i++){
            char[] subc = sp[i].toCharArray();
            int left = 0, right = subc.length-1;
            while(left<right){
                char temp = subc[left];
                subc[left] = subc[right];
                subc[right] = temp;
                left++; right--;
            }
            s+=new String(subc);
            if (i!=sp.length-1){
                s+=" ";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
