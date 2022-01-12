package com.springproject.handle;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


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
     * 环绕通知方法的定义：
     * 1）方法是public
     * 2）方法必须有返回值，推荐使用object类型
     * 3）方法名自定义
     * 4）方法必须有参数，参数为ProceedingJoinPoint参数
     */

    /**
     * @Around: 环绕通知
     *      属性：value 切入点的表达式
     *      位置：方法定义的上面
     *
     * 返回值：Object表示调用目标方法期望得到的执行结果（不一定是目标方法自己的返回值）
     * 参数：ProceedingJoinPoint, 相当于反射中的Method
     *      作用：执行目标方法，相当于Method.invoke()
     *
     * 特点：
     *  1、在目标方法的前后都能增强功能
     *  2、控制方法是否执行
     *  3、可以修改目标方法的执行结果
     */
    @Around(value="execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        // 获取方法执行时的参数值
        String name = "";
        Object args[] = pjp.getArgs();
        if(args != null && args.length > 0){
            Object arg = args[0];
            if(arg!=null){
                name = (String)arg;
            }
        }

        System.out.println("执行了环绕通知的myAround方法");


        Object methodReturn = null;
        // 执行目标方法
        if("lisi".equals(name)){
            methodReturn = pjp.proceed();  // method.invoke(), 表示执行doFirst()方法的本身
        }


//        return "HelloAround, 不是目标方法的执行结果";
        return methodReturn;    // 此时就是返回目标方法的结果
    }


}
