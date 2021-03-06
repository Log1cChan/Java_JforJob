package JavaBasic;

import java.util.HashSet;

public class EqualExample {
    /**
     * @program: CS-Notes
     * @description: 用于实现equals方法
     * @author: Log1c
     * @create: 2021-12-21 16:10
     **/

    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqualExample that = (EqualExample) o;

        if(x != that.x) return false;
        if(y != that.y) return false;
        return z == that.z;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    public static void main(String[] args) {
        EqualExample e1 = new EqualExample(1, 1, 1);
        EqualExample e2 = new EqualExample(1, 1, 1);
//        EqualExample e3 = new EqualExample(1, 1, 2);
//        EqualExample e4 = null;

        System.out.println(e1.equals(e2));
//        System.out.println(e1.equals(e3));
//        System.out.println(e1.equals(e4));
//        System.out.println(e3.equals(e4));

        HashSet<EqualExample> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.toString());
        System.out.println(e2.toString());

    }

}
