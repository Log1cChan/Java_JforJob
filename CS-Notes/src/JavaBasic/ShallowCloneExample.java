package JavaBasic;

public class ShallowCloneExample implements Cloneable{
    /**
     * @program: CS-Notes
     * @description: 实现浅拷贝，拷贝对象和原始对象引用类型引用同一对象
     * @author: Log1c
     * @create: 2021-12-21 16:58
     **/

    private int[] arr;

    public ShallowCloneExample(){
        arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public void set(int index, int value){
        arr[index] = value;
    }

    public int get(int index){
        return arr[index];
    }

//    浅拷贝
    protected ShallowCloneExample clone() throws CloneNotSupportedException{
        return (ShallowCloneExample) super.clone();
    }

    public static void main(String[] args) {
        ShallowCloneExample e1 = new ShallowCloneExample();
        ShallowCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(2, 222);
        System.out.println(e2.get(2)); // 222
    }

}
