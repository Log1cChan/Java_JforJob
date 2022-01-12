package JavaBasic;

public class CloneExample implements Cloneable {
    /**
     * @program: CS-Notes
     * @description: 实现clone方法
     * @author: Log1c
     * @create: 2021-12-21 16:36
     **/
    private int a;
    private int b;

    public CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample)super.clone();
    }

    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        try{
            CloneExample e2 = e1.clone();
            System.out.println(e1==e2);
            System.out.println(e1.hashCode());
            System.out.println(e2.hashCode());
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
