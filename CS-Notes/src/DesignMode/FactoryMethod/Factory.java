package DesignMode.FactoryMethod;

public abstract class Factory {
    /**
     * @program: CS-Notes
     * @description: 工厂方法模式
     *               定义了一个创建对象的接口，但由子类决定要实例化哪个类，将实例化操作推迟到了子类
     * @author: Log1c
     * @create: 2022-01-11 13:53
     **/
    abstract public Product factoryMethod();
    public void doSomething(){
        Product product = factoryMethod();
    }
}
