package com.sprinproject.ba01;

import org.springframework.stereotype.Component;

/**
 * @Component 表示创建对象，对象放到容器中，作用和<bean>一样
 *              属性：value: 表示对象名称，也就是bean的属性
 *              位置：在类的上面，表示创建此类的对象
 *
 * @Component(value="myStudent") 等同于 <bean id="myStudent" class="com.springproject.ba01.Student"/>
 *
 * 和@Component功能相同的创建对象的注解。
 * 1）@Repository：放在dao接口的实现类上面，表示创建dao对象，持久层对象，能访问数据库
 * 2）@Service：   放在业务层接口的实现类上面，表示创建业务层对象，业务层对象有事务功能
 * 3）@Controller：放在控制器类的上面，表示创建控制器对象，属于表示层对象
 *                控制器对象能接受请求，把请求的处理结果显示给用户。
 * 以上四个注解都能创建对象，但123有角色说明，表示对象是分层的，对象是属于不同层的，具有额外的功能。
 */

// 使用value来指定对象的名称
//@Component(value="myStudent")
// 省略value
@Component("myStudent")
// 没有指定对象名称,使用框架默认对象名称: 即类名首字母小写
//@Component
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("Student类无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
