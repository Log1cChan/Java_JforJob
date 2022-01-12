package com.springproject.handle;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

/**
 * @Aspect: 切面类的注解
 *      位置：放在某个类的上面
 *      作用：表示当前类是切面类
 *
 *      切面类：表示切面共能的类
 */
// 有这个注解就是切面呗！
@Aspect
public class MyAspect {

    @Before(value="mypt()")
    public void myBefore(){
        System.out.println("前置通知：在目标方法之前执行");
    }

    @After(value="mypt()")
    public void myAfter(){
        System.out.println("最终通知，总是会被执行的");
    }

    /**
     * @Pointcut: 定义和惯例切入点，不是通知注解。
     *      属性：value 切入点表达式
     *      位置：自定义方法的上面，这个方法看作是切入点表达式的别名，
     *           在其他的通知注解中，可以使用方法名称，表示使用这个切入点表达式
     */
    @Pointcut("execution(* *..SomeServiceImpl.doThird(..))")
    //自由权限，只要能被类内看到就行
    public void mypt(){
        // 无需代码
    }
}
