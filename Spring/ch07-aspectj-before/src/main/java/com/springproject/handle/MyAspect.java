package com.springproject.handle;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect: 切面类的注解
 *      位置：放在某个类的上面
 *      作用：表示当前类是切面类
 *
 *      切面类：表示切面共能的类
 */

@Aspect
public class MyAspect {
    // 定义方法，表示切面的具体功能
    /**
     * 前置通知方法的定义：
     * 1）方法是public
     * 2）方法是void
     * 3）方法名自定义
     * 4）方法可有参数，如果有是JoinPoint
     *      也可以没有
     */


    /**
     * @Before: 前置通知
     *      属性：value 切入点表达式，表示切面执行的位置，表示在这个方法执行时，会同时执行切面功能
     *      位置：在方法的上面
     *
     * 特点：
     * 1）执行时间：在目标方法之前
     * 2）不会影响目标方法的执行
     * 3）不会修改目标方法执行的结果。
     */
//    @Before(value = "execution(public void com.springproject.service.impl.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore(){
//        // 切面的代码
//        System.out.println("前置通知：切面功能，在目标方法之前执行" + new Date());
//
//    }

//    @Before(value = "execution(void com.springproject.service.impl.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore1(){
//        // 切面的代码
//        System.out.println("==前置通知：切面功能，在目标方法之前执行==" + new Date());
//
//    }


    /**
     * 切面类中的通知方法，可以有参数
     * JoinPoint必须是它
     *
     * JoinPoint表示正在执行的业务方法，相当于是反射中的Method
     *      使用要求：必须是参数列表的第一个
     *      作用：获取方法执行时的信息，例如方法名称，方法的参数集合
     */
    @Before(value = "execution(* *..impl.SomeServiceImpl.do*(..))")
    public void myBefore2(JoinPoint jp){

        // 获取方法的定义
        System.out.println("前置通知中，获取目标方法的定义：" + jp.getSignature());
        System.out.println("前置通知中，获取方法的名称：" + jp.getSignature().getName());

        // 获取方法执行时的参数
        Object args[] = jp.getArgs(); // 数组中存放的是 方法中的所有参数
        for (Object obj : args){
            System.out.println("前置通知获取方法的参数: " + obj);
        }

        String methodName = jp.getSignature().getName();
        if ("doSome".equals(methodName)){
            // 切面的代码
            System.out.println("doSome输出日志==前置通知：切面功能，在目标方法之前执行==" + new Date());
        }else if("doOther".equals(methodName)){
            System.out.println("doOther前置通知，作为方法名称，参数的记录。");
        }


    }
}
