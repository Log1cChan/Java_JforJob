package DesignMode;

public class Singleton {
    /**
     * @program: CS-Notes
     * @description: 单例设计模式
     *               确保一个类只有一个实例，并提供该实例的全局访问点
     *               使用一私有构造函数、一私有静态变量以及一个公有静态函数来实现
     * @author: Log1c
     * @create: 2022-01-11 13:19
     **/

//    懒汉式-线程不安全
//    延迟实例化，节约资源；但多线程环境下，可能会实例化多个
//    private static Singleton uniqueInstance;
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getUniqueInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

//    饿汉式-线程安全
//    直接实例化就不会线程不安全
    private static Singleton uniqueInstance = new Singleton();

//    懒汉式-线程安全
//    对方法枷锁就行
    public static synchronized Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
