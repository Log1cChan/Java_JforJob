package JavaBasic;

public class valueOf {
    /**
     * @program: CS-Notes
     * @description: 实现valueOf
     * @author: Log1c
     * @create: 2021-12-21 01:58
     **/

//    public static Integer valueOf(int i){
//        if (i >= IntegerCache.low && i <= IntegerCache.high)
//            return IntegerCache.cache[i + (-IntegerCache.low)];
//        return new Integer(i);
//    }

    public static void main(String[] args) {
        Integer x = new Integer(123);
//        Integer y = valueOf(123);
//        Integer z = valueOf(123);
//        System.out.println(y==z);
//        String s = "123";
//        StringBuffer b

        String s1 = new String("aaa");
//        String s2 = new String("aaa");
//        System.out.println(s1==s2);
//        String s3 = s1.intern();
//        String s4 = s2.intern();
//        System.out.println(s3==s4);
//        System.out.println(s3==s1);
//        System.out.println(s3==s2);
        changeString(s1);
        System.out.println(s1);
    }

    public static void changeString(String s){
        s.toUpperCase();
    }
}
