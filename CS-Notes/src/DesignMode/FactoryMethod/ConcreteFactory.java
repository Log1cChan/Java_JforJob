package DesignMode.FactoryMethod;

public class ConcreteFactory extends Factory {
    /**
     * @program: CS-Notes
     * @description:
     * @author: Log1c
     * @create: 2022-01-11 14:06
     **/
    public Product factoryMethod(){
        return new ConcreteProduct();
    }
}
