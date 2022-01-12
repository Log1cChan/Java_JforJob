package DesignMode.SimpleFactory;

public class SimpleFactory {
    /**
     * @program: CS-Notes
     * @description: 简单工厂模式
     *               在创建一个对象时，不向客户暴露内部细节，并提供一个创建对象的通用接口
     * @author: Log1c
     * @create: 2022-01-11 13:40
     **/
//    把类的实例话操作单独放到一个类中，这个类就是简单工厂类，让简单工厂类来决定应该用哪个具体的子类来实例化
//    实现客户类和具体子类的解耦合

    public Product createProduct(int type){
        if(type==1){
            return new ConcreteProduct();
        }
        return new ConcreteProduct1();
    }
}
