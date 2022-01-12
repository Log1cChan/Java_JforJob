package DesignMode.SimpleFactory;

public class Client {
    /**
     * @program: CS-Notes
     * @description: 客户类
     * @author: Log1c
     * @create: 2022-01-11 13:48
     **/
    public static void main(String[] args) {
        // 此时用户只需要指定某一类型就可以获取该实例
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
