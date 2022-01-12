package OfferK1ller;

public class Offer05 {
    /**
     * @program: R0det041ive
     * @description: 替换空格
     * @author: Log1c
     * @create: 2021-12-20 21:04
     **/
    public static String replaceSpace(String s) {
//        String res = "";
//        for (int i=0; i<s.length(); i++){
//            if (s.charAt(i) != ' '){
//                res += s.charAt(i);
//            }else{
//                res += "%20";
//            }
//        }
//        return res;

        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "     ";
        System.out.println(replaceSpace(s));
    }
}
