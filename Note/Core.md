# Core Tech of Java(Basic)

---

[TOC]

## I Interface & Inheritance & Polymorphism

### 1.  Inheritance of Class

Java uses **extends** keyword to identify the Inheritance between 2 classes.
Basic idea is to extend a basic parent class, subclass inherits the attributes and methods from parent class, also can generate some different mehods and attributes which are not included in parent class or rewrite.

```java
package com.CoreBasic;

class Parent{
    Parent(){
        System.out.println("Call the Construction Method from parent class");
    }
}
class SubParent extends Parent{
    SubParent(){
        System.out.println("Call the Construction Method from subparent class");
    }
}

public class Subroutine extends SubParent {
    /**
     * @program: Core
     * @description: Test of Inheritance
     * @author: Log1c
     * @create: 2021-11-22 17:23
     **/
    Subroutine(){
        System.out.println("Call the Construction Method from subroutine class");
    }

    public static void main(String[] args) {
        Subroutine s = new Subroutine();
    }
}
/*
Call the Construction Method from parent class
Call the Construction Method from subparent class
Call the Construction Method from subroutine class
*/
```

That is to say, instantiate the subclass should first instantiate parent obj.

### 2. Class Object

In java, every class will directly or indirectly inherits **java.lang.Object** 

Some methods in class object:

1. getClass(): return the class object, like: getClass().getName(): can return the name of class
2. toString(): return a object as String form, can be rewrited.
3. equals(): Compare the address of two object

```java
package com.CoreBasic;

class V{}


public class ObjectTest {
    /**
     * @program: Core
     * @description: Some method in java.lang.Object
     * @author: Log1c
     * @create: 2021-11-22 21:23
     **/
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1.equals(s2));
        V v1 = new V();
        V v2 = new V();
        System.out.println(v1.equals(v2));
    }
}
/*
true
false
*/
```

### 3. Object Type Conversion

#### 3.1 Upcasting

```java
package com.CoreBasic;

class Quadrangle{
    public static void draw(Quadrangle q){
        // Some Operations
        System.out.println("Draw a Quadrangle");
    }
}

public class Parallelogram extends Quadrangle {
    /**
     * @program: Core
     * @description: Demo of Upcasting, an object type conversion
     * @author: Log1c
     * @create: 2021-11-22 21:29
     **/
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();
        draw(p);
    }
}
```

Though the param of draw method should be Quadrangle, but here still can use Parallelogram, cos it's Upcasting
In short, Upcasting is to regard the subclass as parentclass

#### 3.2 Downcasting

Transform the abstract class to a more specific one.

### 4. instanceof

When doing downcasting, if the parent class is not the instance of subclass, will throw exception. 
That's why instanceof, it can be used to judge.

### 5. Method Overloading

Literally, allow several methods share the same name inside the same class.

```java
package com.CoreBasic;

public class OverLoadTest {
    /**
     * @program: Core
     * @description: A demo of overloading methods
     * @author: Log1c
     * @create: 2021-11-22 21:50
     **/
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a, double b){
        return 1;
    }
    public static int add(double a, int b){
        return 1;
    }
  // Use Variable-length Argument
    public static int add(int...a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s+=a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(1,2));
        System.out.println("add(double, double): " + add(2.1, 2.2));
        System.out.println("add(int): " + add(1));
        System.out.println("call variable-length argument: " + add(1, 2, 3, 4, 5));
    }
}
```

### 6. Polymorphism

EZ

### 7. Abstract Class and Interface

#### 7.1 Abstract Class

The more parent it is, the more abstract it is. TOT
Use **abstract** keyword to identify a abstract class. Also, the abstract funcs will not have body and meaning.
In short, if a class has a abstract func, it's definitely a abstract class.

```java
public abstract class Test{
  abstract void testAbstract();
}
```

#### 7.2 Interface

All the funcs in interface have no body. Use **implements**
The abstract inside the interface can ignore.

```java
public interface drawTest{
	void draw();
}
```

Use interface can implement multiple inheritance!

## II Some Advanced Features of Class

### 1. Final variable

The keyword **final** can be used to declare a variable, the vairable once be set, can not be changed(value).

```java
final double PI = 3.14;
```

**Warning:** The final variable should be initialized when it was created. Also can be used on Obj.
The final variable always use uppercase.

### 2. Final Method

First, final method can not be rewritten!!!
That is to say, a method that is private, it's final.

### 3. Final Class

Final Class can't be inherited by any other. Also, can not be changed.

### 4. Inner Class

If declare a class inside a class, the inner class is just so.

#### 4.1 Member Inner Class

Inner class can use the member variable and member method of outer class, even they are private.
Inner class's instance must bing in the outer class's instance. Just take a look at the demo.

```java
package com.SomeAdvancedFeatures;

public class OuterClass {
    /**
     * @program: Core
     * @description: A demo for inner class basic
     * @author: Log1c
     * @create: 2021-11-24 16:02
     **/
    innerClass in = new innerClass(); // instantiate the innerclass obj in outer
    public void ouf(){
        in.inf(); // calls the inner mehod in outer
    }
    class innerClass {
        innerClass(){
        }
        public void inf(){
        }
        int y = 0;
    }
    public innerClass doit(){
//        y = 4;  // this is wrong
        in.y = 4;
        return new innerClass();
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.innerClass in = out.doit();
        OuterClass.innerClass in2 = out.new innerClass();
    }
}
```

**Stressed** : Page 204, InterfaceInner!!!

#### 4.2 Local Inner Class

Inner class can be define in any pos.

```java
package com.SomeAdvancedFeatures;

interface OutInterface2{

}

public class OuterClass3 {
    /**
     * @program: Core
     * @description: A demo for local inner class
     * @author: Log1c
     * @create: 2021-11-24 16:24
     **/
    public OutInterface2 doit(final String x){
        class InnerClass2 implements OutInterface2{
            InnerClass2(String s){
                s = x;
                System.out.println(s);
            }
        }
        return new InnerClass2("doit");
    }
}

```

#### Anonymous inner class & static inner class Page 207

## III Exception Handling

### 1. How to Handle Exception

In java, if a function throws a exception, can be catched inside the func and handled, also, can throw to the caller to handle.

#### 1.1 Catch the Exception

The structure of catch formed by **try, catch and finally**
**try**: Put the Java sentences that may cause Exception
**catch**: After try, to stimulate the exception
**finally**: the final part, no matter where it exit in try, the finally part always execute.

**Grammar:**

```java
try{
	// code block
}catch(Exceptiontype e){
	// handling code block
}catch(OtherExceptiontype e){
	// ditto
}
...
finally{
	// code block
}
```

**Demo:**

```java
package com.ExceptionHandling;

public class Take {
    /**
     * @program: Core
     * @description: A demo for try-catch block
     * @author: Log1c
     * @create: 2021-11-24 16:41
     **/
    public static void main(String[] args) {
        try {
            String str = "lili";
            System.out.println(str + "'s age is: ");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("program over");
    }
}
/*
lili's age is: 
program over
java.lang.NumberFormatException: For input string: "20L"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.ExceptionHandling.Take.main(Take.java:14)
*/
```

Not hard to see, the program won't be ended by the exception. 
Completed exception handling sentences should include **finally**.

### 2. Custom Exception

In addition to the common exception provided by Java, user can inherit the class **Exception**.
Step:
(1) Create custom exception class
(2) Throw the exception obj inside the func via keyword **throw**
(3) If handle the exception inside the func, use try-catch. Else, throw the exception via **throws** to the caller.
(4) Handle in the caller.

**Demo:**

```java
package com.ExceptionHandling;

public class MyException extends Exception {
    /**
     * @program: Core
     * @description: A custom exception
     * @author: Log1c
     * @create: 2021-11-24 17:08
     **/
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}
----------------------------------------------------------------------------------------------------
package com.ExceptionHandling;

public class Tran {
    /**
     * @program: Core
     * @description: A demo for Custom Excption
     * @author: Log1c
     * @create: 2021-11-24 17:07
     **/
    static int avg(int number1, int number2)throws MyException{
        if (number1 < 0 || number2 < 0){
            throw new MyException("Can't use negative num");
        }
        if (number1 > 100 || number2 > 100){
            throw new MyException("The num is too large");
        }
        return (number1+number2)/2;
    }

    public static void main(String[] args) {
        try{
            int result = avg(102, 150);
            System.out.println(result);
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
/*
com.ExceptionHandling.MyException: The num is too large
*/
```

### 3. Throw Exception inside the Func

If the func may have exception but don't want to handle it inside the func, can use **throws, throw** to throw the exception.

#### 3.1 Use throws

Usually, **throws** is used when a func is declare. More than one exception can be seperated by comma.

```java
package com.ExceptionHandling;

public class Shoot {
    /**
     * @program: Core
     * @description: A demo for throws keyword
     * @author: Log1c
     * @create: 2021-11-24 17:16
     **/
    static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try{
            pop();
        }catch(NegativeArraySizeException e){
            System.out.println("Exception throw by pop()");
        }
    }
}
```

#### 3.2 Use throw

Usually, used in func body, throw a Exception obj, when the program comes to throw the program end immediately.
If want to handle in back code, need to use throws.

```java
package com.ExceptionHandling;

public class MyException1 extends Exception {
    /**
     * @program: Core
     * @description: A Exception for throw
     * @author: Log1c
     * @create: 2021-11-24 17:25
     **/
    String message;
    public MyException1(String ErrorMessage){
        message = ErrorMessage;
    }
    public String getMessage() {
        return message;
    }
}
--------------------------------------------------------------------------------------------------------
package com.ExceptionHandling;

public class Captor {
    /**
     * @program: Core
     * @description: A demo for throw
     * @author: Log1c
     * @create: 2021-11-24 17:26
     **/
    static int quotient(int x, int y)throws MyException1 {
        if (y<0){
            throw new MyException1("divisor can't be negaive");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try{
            int result = quotient(3, -1);
        }catch(MyException1 e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("divisor can't be negaive");
        }catch(Exception e){
            System.out.println("Other Exception");
        }
    }
}
```

### 4. RuntimeException

RuntimeException is the exception generated while the program is running. Page219

## IV Swing Program Designing

Using Swing program in any platform will have a uniform style. That's it.
Java.lang.Object <-- Java.awt.Component <-- Java.awt.Container <-- Javax.swing.JComponent

### 1. Common Frame

#### 1.1 JFrame

JFrame is a container, Java.swing.JFrame
**Grammar:**

```java
JFrame jf = new JFrame(title);
Container container = jf.getContentPane();
container.add(new JButton("Button"));
container.remove(new JButton("Button"));
```

Demo:

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JFrame
     * @author: Log1c
     * @create: 2021-11-24 20:09
     **/
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("This is a JFrame");  // create a Jlabel
        jl.setHorizontalAlignment(SwingConstants.CENTER); // center align

        container.add(jl);
        container.setBackground(Color.CYAN);
        jf.setVisible(true); // make it visible
        jf.setSize(600, 450);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreateJFrame("Create a JFrame");
    }
}
```

Use setVisible(true); to make it visible cos it's originally invisible. Use setSize(x,y); to set size.

#### 1.2 JDialog

JDialog is a dialog box of Swing Components. Inherit AWT components' java.awt.Dialog
Function: pop out another window from a window. A little bit same with JFrame, need to getContentPane() to container.
**public JDialog(Frame f, String title, boolean model)**: f: Father frame; title.

Demo:

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame){
        super(frame, "First JDialog", true);
        Container container = getContentPane();
        container.add(new JLabel("This is a Dialog"));
        setBounds(120, 120, 100, 100);
        setSize(200, 200);
    }
}

public class MyFrame extends JFrame{
    /**
     * @program: Core
     * @description: Example of JDialog
     * @author: Log1c
     * @create: 2021-11-24 20:22
     **/
    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("This is a JFrame");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton jb = new JButton("POPOUT");
        jb.setBounds(200, 200, 100, 50);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(jb);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```

**Warning:** Look at the other way to initialize a JFrame

### 2. Label & Icon

#### 2.1 How to use Label

Declared by JLabel, parent class is JComponent.
public Label(String text, Icon icon, int aligment);

#### 2.2 How to use Icon

Can use pics or java.awt.Graphics
Using Icon interface to generate icon, MUST override: getIconHeight, getIconWidth, paintIcon(Component arg0, Graphics arg1, int arg2, int arg3);
Demo:

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon { // implements Icon interface
    /**
     * @program: Core
     * @description: A demo for using Icon
     * @author: Log1c
     * @create: 2021-11-24 22:02
     **/
    private int width;
    private int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIcon(int width, int height){
        this.width = width;
        this.height = height;
    }
    // override paintIcon()
    public void paintIcon(Component arg0, Graphics arg1, int x, int y){
        arg1.fillOval(x, y, width, height);
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel jl = new JLabel("Test", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame("FY");
        Container c = jf.getContentPane();
        c.add(jl);
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```

### 3. Common Layout Manager

#### 3.1 Absolute Layout

In addition to Layout Manager in Java, can use Absolute Layout, just use absolute coordinate to set the pos of components.
**Step:**
(1) Use Container,setLayout(null) to cancel Layout Manager.
(2) Use Component,setBounds() to set the size and pos of all the components.
**setBounds(int x, int y, int width, int height);**

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Absolute Layout
     * @author: Log1c
     * @create: 2021-11-26 16:03
     **/
    public AbsolutePosition() {
        setTitle("This window uses Absolute Layout");
        setLayout(null);
        setBounds(0, 0, 200, 150);
        Container c = getContentPane();
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        b1.setBounds(10, 30, 80, 30);
        b2.setBounds(60, 70, 100, 20);
        c.add(b1);
        c.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
```

#### 3.2 Flow Layout

The basic manager, from left to right until all the space is occupied. Then, next line.

**Common Construction Method:**
public FlowLayout()
public FlowLayout(int alignment)
public FlowLayout(int alignment, int horizGap, int vertGap)
**alignment**:
FlowLayout.LEFT = 0, FlowLayout.CENTER = 1, FlowLayout.RIGHT = 2.
horizGap & vertGap: horizontal and verticlal gap

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Flow Layout
     * @author: Log1c
     * @create: 2021-11-26 16:12
     **/
    public FlowLayoutPosition(){
        setTitle("This window uses Flow Layout");
        Container c = getContentPane();
        setLayout(new FlowLayout(2, 10, 10));
        for (int i=0; i<10; i++){
            c.add(new JButton("Button" + i));
        }
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}

```

#### 3.3 Border Layout

The Default Layout of swing. EZ

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Border Layout
     * @author: Log1c
     * @create: 2021-11-26 16:19
     **/
    // Set an array for the positions of components
    String[] border = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
    String[] buttonName = {"Center Button", "North Button", "South Button", "West Button", "East Button"};
    public BorderLayoutPosition(){
        setTitle("This window uses Border Layout");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        for (int i=0; i<border.length; i++){
            c.add(border[i], new JButton(buttonName[i]));
        }
        setSize(350, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
```

#### 3.4 Grid Layout

Dividing the container into grid, all components can align via column or row.
**Common Constrution Method:**
public GridLayout(int rows, int columns);
public GridLayout(int rows, int columns, int horizGap, int vertGap);

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Grid Layout
     * @author: Log1c
     * @create: 2021-11-26 16:30
     **/
    public GridLayoutPosition(){
        Container c = getContentPane();
        setLayout(new GridLayout(7, 3, 5, 5));
        for (int i=0; i<21; i++){
            c.add(new JButton("Button" + i));
        }
        setSize(300, 300);
        setTitle("This window uses Grid Layout");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
```

#### **3.5 GridBag Layout** Page236

A dynamic rectanglar net, made up by countless cell, can add or delete due to actual condition.
When add components to it, need to create a GridBagConstraints Obj, set the Layout info.

### 4. Common Panels

#### 4.1 JPanel

Panel is also a container.
**Demo:**

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    /**
     * @program: Core
     * @description: A test of JPanel
     * @author: Log1c
     * @create: 2021-11-26 18:42
     **/
    public JPanelTest(){
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));
        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
```

#### 4.2 JScrollPane

Just a panel can scroll in order to display more content.
If want to put components inside, just put in JPanel and then put it in.
Demo:

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JScrollPane
     * @author: Log1c
     * @create: 2021-11-26 18:50
     **/
    public JScrollPaneTest(){
        Container c = getContentPane();
        JTextArea ta = new JTextArea(20, 50);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("This window uses JScrollPane");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
```

### 5. Button Component

Swing provides several kinds of button, they all inherit AbstractButton.

#### 5.1 JButton

**Construction Method:**
public JButton()
public JButton(String text)
public JButton(Icon icon)
public JButton(String text, Icon icon)

```java
package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JButton
     * @author: Log1c
     * @create: 2021-11-26 22:32
     **/
    public JButtonTest(){
        Container c = getContentPane();
        JButton jb = new JButton("Warning!");
        // add an Actionlistener to the button
        jb.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null, "Pop out Dialog!");
           }
        });
        c.setLayout(null);
        jb.setBounds(150, 150, 100, 50);
        c.add(jb);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
```

#### 5.2 JRadioButton

...

...

### 9. Common Action Event Listener

## V Colletion Class

java.util class provides some colletion class, also called container.
The length of collection class is dynamic. Like: List, Set, Map.

### 1. Colletion Interface

Often can't be used directly, if want to traverse the collection, just via Iterator.

Example: ( iterator() )

```java
package com.SwingPrograming;

import java.util.*;

public class Muster {
    /**
     * @program: Core
     * @description: A demo of Iterator
     * @author: Log1c
     * @create: 2021-11-26 22:48
     **/
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator(); // Construct a Iterator
        while(it.hasNext()){ // if there is next element
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
```

### 2. List

Include List interface and all the Iimplementation classes.
List interface inherits Collection interface, so include all the method in Collection. 
Also: get(int index); set(int index, Object obj);

**Common impletation classes**:
ArrayList: dynamic array, allow store all element, including "null"
LinkedList: Linked list

```java
List<E> list = new ArrayList<>();
List<E> list = new LinkedList<>();
// E is legal data type
```

Demo:

```java
package com.ColletionClass;

import java.util.*;

public class Gather {
    /**
     * @program: Core
     * @description: A demo for the Collection implemented class: List
     * @author: Log1c
     * @create: 2021-11-26 23:40
     **/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size());
        System.out.println("Randomly get a element from the list: " + list.get(i));
        list.remove(2);
        System.out.println("After removing the index 2: ");
        for (int j=0; j<list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}
```

### 3. Set

In Set, all objs are unordered, so can't have repeted obj.

**Common implementation class**:
HashSet: supported by HashMap, allow using null.
TreeSet: also implement java.util.SortedSet interface, so, traverse as natural sequential increase.

Demo using some technique in Set:

```java
package com.ColletionClass;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object>{ // implement the interface
    /**
     * @program: Core
     * @description: A demo of Set, implements Comparable interface and rewrites the compareTo() method.
     * @author: Log1c
     * @create: 2021-11-26 23:51
     **/
    String name;
    long id;

    public UpdateStu(String name, long id){     // Construction Method
        this.id = id;
        this.name = name;
    }

    // If store in TreeSet, must implement Comparable interface.
    // the func below is used to compare the obj to assigned obj.
    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id==upstu.id ? 0 : -1);
        return result;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 01011);
        UpdateStu stu2 = new UpdateStu("陈同学", 01021);
        UpdateStu stu3 = new UpdateStu("王同学", 01051);
        UpdateStu stu4 = new UpdateStu("马同学", 01012);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> it = tree.iterator();   // Create a iterator for all the elements inside Set
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.headSet(stu2).iterator();     // get all previous objs of stu2
        System.out.println("Previous elements of stu2: ");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.subSet(stu2, stu3).iterator();    // get elements between
        System.out.println("Elements between stu2&3: ");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }
}
```

### 4. Map

Map collection didn't implement Colletion interface, it provides a map of key to value.
Not allow to have same key! Use a hash tech to allocate.

#### 4.1 Map Interface

Map interface provides a map, the map can't contain repeated key.
**Some Methods:**
put(K key, V value), containsKey(Object key), containsValue(Object value), get(Object key), keySet(), values().

Demo:

```java
package com.ColletionClass;

import java.util.*;

public class UpdateStu2 {
    /**
     * @program: Core
     * @description: A demo of map and some methods of
     * @author: Log1c
     * @create: 2021-11-27 17:13
     **/
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "李同学");
        map.put("02", "魏同学");
        Set <String> set = map.keySet();        // all keys in map
        Iterator <String> it = set.iterator();
        System.out.println("All elements in Key: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection <String> coll = map.values();    // all values in map
        it = coll.iterator();
        System.out.println("All elements in Value: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
```

#### 4.2 Map Implementation Class

Common: HashMap & TreeMap. Suggest: HashMap.

**HashMap:** allow use null

```java
package com.ColletionClass;

import java.util.*;

public class MapText {
    /**
     * @program: Core
     * @description: Main class for testing
     * @author: Log1c
     * @create: 2021-11-27 17:23
     **/
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();  // Create a HashMap

        Emp emp = new Emp("351", "张三");
        Emp emp2 = new Emp("512", "李四");
        Emp emp3 = new Emp("853", "王一");
        Emp emp4 = new Emp("125", "赵六");
        Emp emp5 = new Emp("341", "黄七");

        map.put(emp4.getE_id(), emp4.getE_name());
        map.put(emp5.getE_id(), emp5.getE_name());
        map.put(emp.getE_id(), emp.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());

        Set <String> set = map.keySet();    // get key obj in Map
        Iterator <String> it = set.iterator();
        System.out.println("HashMap, Unordered: ");
        while (it.hasNext()){
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }

        TreeMap<String, String> treemap = new TreeMap<>();  // Create a TreeMap
        treemap.putAll(map);
        Iterator <String> iter = treemap.keySet().iterator();
        System.out.println("TreeMap, Ascending Order: ");
        while (iter.hasNext()){
            String str = (String)iter.next();
            String name = (String)treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
```

## VI I/O(Input&Output)

Stream is an ordered data series, on the basis of the operation type, can be divided into Input/Output.

### 1. Input/Output Stream

Java has many kinds of classes in charge of I/O, in java.io.
All the Input Stream classes are the subclasses of abstract class: InputStream or Reader.
All the Output Stream classes are the subclasses of abstract class: OutputStream or Writer.

#### 1.1 Input Stream & Output Stream Page 270

### 2. File Class

File class is the only obj represent disk file in java.io.

#### 2.1 Create and Delete Files

**Constructor:**
(1) File(String pathname): File file = new File("d:/1.txt");
(2) File(String parent, String child)
(3) File(File f, String child)

**Demo:**

```java
public static void main(String[] args) throws IOException {
        File file = new File("word.txt");       // create a file obj
        if (file.exists()){                              // If the file exist
            file.delete();
            System.out.println("The file has been deleted");
        }else{
            try{
                file.createNewFile();
                System.out.println("The file has been created");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
```

#### 2.2 Get File Info

Provides many methods to get info of file.

Demo:

```java
File file = new File("word.txt");   // create a File obj
        if (file.exists()){                         // if the file exists
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("File name: " + name);
            System.out.println("File length: " + length);
            System.out.println("Is hidden? " + hidden);
        }else{
            System.out.println("No such file");
        }
```

### 3. File Input/Output Stream

#### 3.1 FileInputStream and FileOutputStream

Both used to operate disk file. Both provides basic writing ability.

Constructor:
FileInputStream(String name): Set a name for the FileInputStream obj.
FileInputStream(File file): Uses File obj to create a FileInputStream obj.

Demo:

```java
package com.IOPart;

import java.io.*;

public class FileTest1 {
    /**
     * @program: Core
     * @description: A demo for FileInputStream and Ops
     * @author: Log1c
     * @create: 2021-11-28 14:54
     **/
    public static void main(String[] args) {
        File file = new File("word.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);  // create a FileOutputStream obj
            byte buy[] = "Hola, mi amigo, bunos dias!".getBytes();  // create a byte array
            out.write(buy);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);             // read from file
            System.out.println("The message in the file: " + new String(byt, 0, len));
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

#### 3.2 FileReader and FileWriter

Use these both better than the two before.

```java
package com.IOPart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ftest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for FileReader and FileWriter
     * @author: Log1c
     * @create: 2021-11-28 15:06
     **/
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;

    private JButton getOpenButton(){
        if(openButton == null){
            openButton = new JButton();
            openButton.setText("Write");
            openButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    File file = new File("word.txt");
                    try{
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton(){
        if(closeButton == null){
            closeButton =new JButton();
            closeButton.setText("Read");
            closeButton.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   File file = new File("word.txt");
                   try{
                       FileReader in = new FileReader(file);
                       char byt[] = new char[1024];
                       int len = in.read(byt);
                       jTextArea.setText(new String(byt, 0, len));
                       in.close();
                   }catch(Exception e1){
                       e1.printStackTrace();
                   }
               }
            });
        }
        return closeButton;
    }

    public Ftest(){
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    public JTextArea getJTextArea(){
        if(jTextArea==null){
            jTextArea = new JTextArea();
        }
        return jTextArea;
    }

    public JPanel getControlPanel(){
        if(controlPanel == null){
            controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(1, 2));
            controlPanel.add(getOpenButton());
            controlPanel.add(getCloseButton());
        }
        return controlPanel;
    }

    private JPanel getJContentPane(){
        if(jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJTextArea(), BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public static void main(String[] args) {
        Ftest thisClass = new Ftest();
        thisClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }
}
```

### 4. I/O with Buffer

#### 1. BufferedInputStream and BufferedOutputStream

Achieve performace optimization.

Constructor:
BufferedInputStream(InputStream in)
BufferedInputStream(InputStream in, int size)

### 2. BufferedReader and BufferedWriter

Inherit from Reader and Writer.

**Common Methods:**
BufferedReader:
read(): read single char
readLine(): read a text line, return as string, if no string, return null.
BufferedWriter:
flush(): refresh the stream's buffer
newLine(): write a seperated symbol
write(String s, int off, int len): write in part of the string

While using write() method, data not immediately write in, first into the buffer area.
If want to immediately write in, must call flush()

```java
package com.IOPart;

import java.io.*;

public class Student {
    /**
     * @program: Core
     * @description: A demo for BufferedReader
     * @author: Log1c
     * @create: 2021-11-29 12:21
     **/
    public static void main(String[] args) {
        String content[] = {"Long time no see", "How are you?", "Keep in touch!"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);   // create FileWriter as obj
            BufferedWriter bufw = new BufferedWriter(fw);   // create BufferedWriter obj
            for (int k=0; k<content.length; k++){
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine())!=null){
                i++;
                System.out.println("Line No." + i + ": " + s);
            }
            bufr.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

### 5. Data Input/Output Stream

**Constructor:**
DataInputStream(InputStream in)
DataOutputStream(OutputStream out)

**3 Methods provided by DataOutputStream to write in string:**
writeBytes(String s)
writeChars(String s)
writeUTF(String s)

DataInputStream only provides readUTF() return string

```java
package com.IOPart;

import java.io.*;

public class Example_01 {
    /**
     * @program: Core
     * @description: Use DataInput/OutputStream
     * @author: Log1c
     * @create: 2021-11-29 12:33
     **/
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("word.txt");
            DataOutputStream ds = new DataOutputStream(fs);

            ds.writeUTF("Use writeUTF() to write in");
            ds.writeChars("Use writeChars() to write in");
            ds.writeBytes("Use writeBytes() to write in");
            ds.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

### 6. ZIP I/O Stream

#### 6.1 Compress File

Use ZipOutputStream can compress the file into .zip file.

**Constructor:**
ZipOutputStream(OutputStream out);

Demo:

```java
package com.IOPart;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
    /**
     * @program: Core
     * @description: Compress the hello.txt
     * @author: Log1c
     * @create: 2021-11-29 12:49
     **/
    private void zip(String zipFilename, File inputFile)throws Exception{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFilename));   // create ZipOutputStream obj
        zip(out, inputFile, inputFile.getName());
        System.out.println("Compressing");
        out.close();
    }

    private void zip(ZipOutputStream out, File f, String base)throws Exception{
        if(f.isDirectory()){        // if the path is a cate
            File[] fl = f.listFiles();      // get path array
            if (base.length() != 0){
                out.putNextEntry(new ZipEntry(base+"/"));
            }
            for (int i=0; i<fl.length; i++){
                zip(out, fl[i], base + fl[i].getName());
            }
        }else{
            out.putNextEntry(new ZipEntry(base));       // create new entry point
            FileInputStream in = new FileInputStream(f);
            int b;
            System.out.println(base);
            while((b=in.read()) != -1){   // if not get to tail
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] args) {
        MyZip book = new MyZip();
        try {
            book.zip("hello.zip", new File("hello.txt"));
            System.out.println("Compress Finished!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
```

#### 6.2 Decompress File

Use ZipInputStream can read zip file.

```java
package com.IOPart;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompressing {
    /**
     * @program: Core
     * @description: Decompress the file hello.zip
     * @author: Log1c
     * @create: 2021-11-29 13:16
     **/
    public static void main(String[] args) {
        File file = new File("hello.zip");
        ZipInputStream zin;
        try{
            ZipFile zipFile = new ZipFile(file);        // Create zip file obj
            zin = new ZipInputStream(new FileInputStream(file));    // instantiate and assign the file to decompress
            ZipEntry entry = zin.getNextEntry();    // Skip root cate, get next ZipEntry
            File tmp = new File("hello1.txt");
            if(!tmp.exists()){
                OutputStream os = new FileOutputStream(tmp);
                InputStream in = zipFile.getInputStream(entry);
                int count = 0;
                while ((count=in.read())!=-1){
                    os.write(count);
                }
                os.close();
                in.close();
            }
            zin.closeEntry();
            System.out.println("hello1.zip" + " Decompressed Succefully");

            File file1 = new File("hello1.txt");
            FileInputStream reader = new FileInputStream(file1);
            byte byt[] = new byte[1024];
            int len = reader.read(byt);
            System.out.println(new String(byt, 0, len));
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

## VII Reflect

Can visit the obj's description which is already loaded to JVM via reflect.

### 1. Visit Constructor

Visit Constructor via the methods below, return Constructor obj or array. Each Constructor is a Constructor.

**Methods:**
getConstructors()
getConstructor(Class<>...parameterTypes)
getDeclaredConstructors()
getDeclaredConstructor(Class<?>...parameterType)

...

### 2. Annotation



## VIII Enumeration Type and Generic Type

### 1. Enumeration Type

#### 1.1 Usage of setting constants

Use enum to set:

```java
public enum Constants{
	Constants_A;
	Constants_B;
	Constants_C;
}
// Equals
public interface Constants{
	public static final int Constants_A = 1;
}
```

**enum** is the keyword of Enumeration. While using, can use *Constants.Constants_A*

Demo:

```java
package com.EnumerationandGeneric;

interface Constants{        // put constants inside a interface
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}

public class ConstantsTest {
    /**
     * @program: Core
     * @description: A demo for using enum to set constant variable
     * @author: Log1c
     * @create: 2021-11-29 16:34
     **/
    enum Constants2{
        Constants_A, Constants_B        // put constants inside enum
    }

    // use interface to set constants
    public static void doit(int c){
        switch (c){
            case Constants.Constants_A:
                System.out.println("doit() Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit() COnstants_B");
                break;
        }
    }

    public static void doit2(Constants2 c){
        switch (c){
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }

    public static void main(String[] args) {
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(Constants.Constants_B);
        ConstantsTest.doit(3);
//        ConstantsTest.doit2(3);
    }
}
```

#### 1.2 More about Enum

enum inherit from java.lang.Enum. When declare a enum, each enum can be regarded as a instantiation of it. These members are defaultly final, public, static.
So, when need to use, just use the name.

**(1) values():**
Return the enum members as an array.
**Demo:**

```java
package com.EnumerationandGeneric;

public class ShowEnum {
    /**
     * @program: Core
     * @description: A demo for values() method
     * @author: Log1c
     * @create: 2021-11-29 21:12
     **/
    enum Constants2{
        Constants_A, Constants_B
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println("Enum member: " + Constants2.values()[i]);
        }
    }
}
```

**(2) valueOf() and compareTo():**
Converse string into enum;
Compare two enums's order when they were defined.

```java
package com.EnumerationandGeneric;

public class EnumMethodTest {
    /**
     * @program: Core
     * @description: A demo for valueOf() and compareTo()
     * @author: Log1c
     * @create: 2021-11-29 21:26
     **/
    enum Constants2{
        Constants_A, Constants_B
    }
    public static void compare(Constants2 c){   // Compare enum
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(c + " compares to " + Constants2.values()[i] + ": " + c.compareTo(Constants2.values()[i]));
        }
    }

    public static void main(String[] args) {
        compare(Constants2.valueOf("Constants_B"));
    }
}
```

Easy to see, if the result is positive, the pos is ahead of, else, behind.

**(3) ordinal()**
Return an index of certain enum obj.

```java
package com.EnumerationandGeneric;

public class EnumIndexTest {
    /**
     * @program: Core
     * @description: A demo for ordinal()
     * @author: Log1c
     * @create: 2021-11-29 21:33
     **/
    enum Constants2 {
        Constants_A, Constants_B, Constants_C
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(Constants2.values()[i] + "'s pos in enum is: " + Constants2.values()[i].ordinal());
        }
    }
}
```

**Constructor of enum:**

Can add constructor, also, should be modified as private.
**Format:**

```java
enum enumName{
  Constants_A("This is enum A"),
  Constants_B("This is enum B"),
  Constants_C("This is enum C"),
  Constants_D(3);
  private String description;
  private Constants2(){			// Default Constructor
  }
  private Constants2(String description){			// private!!!
    this.description = description;
  }
  private Constants2(int i){
    this.i = this.i + i;
  }
}
```

**Demo in use:**

```java
package com.EnumerationandGeneric;

public class EnumIndexTest2 {
    /**
     * @program: Core
     * @description: A demo for using constructor while using enum
     * @author: Log1c
     * @create: 2021-11-29 21:41
     **/
    enum Constants2 {
        Constants_A("This is enum A"),
        Constants_B("This is enum B"),
        Constants_C("This is enum C"),
        Constants_D(3);
        private String description;
        private int i = 4;
        private Constants2(){}
        private Constants2(String description){
            this.description = description;
        }
        private Constants2(int i){
            this.i = this.i + i;
        }
        public String getDescription() {
            return description;
        }
        public int getI(){
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(Constants2.values()[i] + " call getDescription(): " + Constants2.values()[i].getDescription());
        }
        System.out.println(Constants2.valueOf("Constants_D") + " call getI(): " + Constants2.valueOf("Constants_D").getI());
    }
}
```

### 2. Generics

Actually, is to defined a safe type.

#### 2.1 Define Generics

**Grammar:**

```java
className<T>	// T represents a typename
```

**Demo**

```java
package com.EnumerationandGeneric;

public class OverClass<T> {     // Define a generic class
    /**
     * @program: Core
     * @description: A demo for defining generics
     * @author: Log1c
     * @create: 2021-11-30 14:41
     **/
    private T over; // Define generic member variable
    public T getOver(){
        return over;
    }
    public void setOver(T over){
        this.over = over;
    }

    public static void main(String[] args) {
        OverClass<Boolean> over1 = new OverClass<Boolean>();    // instantiate a Boolean obj
        OverClass<Float> over2 = new OverClass<Float>();    // ditto
        over1.setOver(true);    // No need to casting
        over2.setOver(12.3f);   // ditto
        Boolean b = over1.getOver();
        Float f = over2.getOver();
        System.out.println(b);
        System.out.println(f);
    }
}
```

Easy to see, adding a <T> to the end of the class can use generic.
While using generic, don't need to casting, just do it.
Remember the return type is ***T***.

#### 2.2 Regular Use

(1) Can declare many type when define generics:

```java
MutiOverClass<T1, T2>
MutiOverClass: genericName

// While using:
MutiOverClass<Boolean, Float> = new MutiOverClass<Boolean, Float>();
```

(2) Declared array type when defining

```java
package com.EnumerationandGeneric;

public class ArrayClass<T> {
    /**
     * @program: Core
     * @description: A demo for declaring array when using generic
     * @author: Log1c
     * @create: 2021-11-30 14:53
     **/
    private T[] array;  // Defining generic array
    public void SetT(T[] array){
        this.array = array;
    }
    public T[] getT(){
        return array;
    }

    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array = {"Member1", "Member2", "Member3", "Member4", "Member5",};
        a.SetT(array);
        for (int i=0; i<a.getT().length; i++){
            System.out.println(a.getT()[i]);
        }
    }
}
```

(3) Collection Class declare container's element
Use K&V to reprensent the key and value in the container.

```java
package com.EnumerationandGeneric;

import java.util.*;

public class MutiOverClass<K, V> {
    /**
     * @program: Core
     * @description: A demo for using generic to set a container for collection
     * @author: Log1c
     * @create: 2021-11-30 15:02
     **/
    public Map<K, V> m = new HashMap<K, V>();
    public void put(K k, V v){
        m.put(k, v);
    }
    public V get(K k){
        return(m.get(k));
    }
    public static void main(String[] args) {
        MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
        for (int i=0; i<5; i++){
            mu.put(i, "This is member" + i);
        }
        for (int i=0; i<mu.m.size(); i++){
            System.out.println(mu.get(i));
        }
    }
}
```

But actually, this is make an unnecessary move, becos in Java, these container frame are generification.

#### 2.3 Advanced Usage

**Limit the available type of generics**

Can use any type to instantiate a generic, but java also limits the type of those instantiation.

```java
class className<T extends anyClass> //anyClass: any interface or class
```

While using this limit, shold use **extends** keyword.

```java
package com.EnumerationandGeneric;

import java.util.*;

public class LimitClass<T extends List> {       // limit the type of generic
    /**
     * @program: Core
     * @description: A demo of limiting generic
     * @author: Log1c
     * @create: 2021-11-30 16:04
     **/
    public static void main(String[] args) {
        LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
        LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
        // previous code is ok
        // the code below is wrong, cos there's no List() in HashMap
//        LimitClass<HashMap> l3 = new LimitClass<HashMap>();
    }
}
```

**Use type wildcard**

The effect is: limit th generic's instantiation or inherit while create it.

```java
genericName<? extends List> a = null;
// ?: Unknown Type
// While using, can instantiate alone
```

This is hard...

## IX Multi-thread

### 1. Two ways to instantiate thread

There are 2 ways to do it, java.lang.Thread and java.lang.Runnable

#### 1.1 Inherit Thread Class

Instantiation of this class is thread.

**Constructors:**
public Thread(): creat a thread obj;
public Thread(String threadName): ditto but has a name

```java
public class ThreadTest extends Thread{
	// some code
}
```

If want to reveal its function, need to override **run()** method which includes the function of the thread, then use **start()** method to execute it(so-called: call run())

```java
package com.ThreadPart;

public class ThreadTest extends Thread{     // extends Thread class
    /**
     * @program: Core
     * @description: A demo of extending thread
     * @author: Log1c
     * @create: 2021-12-11 19:56
     **/
    private int count = 10;
    public void run(){  // override run() method
        while (true) {
            System.out.println(count+" ");
            if (--count == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start(); // call run()
    }
}

```

#### 1.2 Instantiate Runnable Interface

**Grammar:**

```java
public class Thread extends Object implements Runnable
```

The program implements Runnable interface will create a Thread obj, and, attach Runnable obj to Thread obj.

**Constructor:**
public Thread(Runnable target);
public Thread(Runnable target, String name);
Use the constructors above can attach Runnable obj to Thread obj.

**Steps of using Runnable interface to execute a new thread:**
(1) create Runnable obj;
(2) Use constructor to attach;
(3) call start(); to execute thread.

```java
package com.ThreadPart;

public class RunnableTest {
    /**
     * @program: Core
     * @description: A demo for another way to create a thread: Runnable Interface
     * @author: Log1c
     * @create: 2021-12-11 20:07
     **/
    private static Thread t;
    private int count = 0;

    public RunnableTest(){
        t = new Thread(new Runnable(){      // anonymous inner class and implements Runnable interface
            public void run(){          // override run() method
                while (count <= 200){
                    System.out.println(count);

                    try {
                        Thread.sleep(100);     // let the thread sleep for 1000ms
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    count+=4;
                    if (count == 200){
                        count = 10;
                    }
                }
            }
        });
        t.start();                  // execute thread
    }

    public static void main(String[] args) {
        new RunnableTest();
    }
}
```

### 2. Life Cycle of Thread

Thread has life cycle, seven states of it:
born, ready, running, waiting, sleep, blocked, die.

Born: when a thread is created and yet not call start();
Ready: after call start();
Running: when a thread get resource. Once when a thread is running, it will converse between ready and running, also, waiting, sleep and blocked or dead.
Waiting: when a running thread calls wait() method, and will be awaken by notify(), notifyAll() will wake all waiting threads.
Sleep: when calls sleep().
Blocked: If a thread sends I/O request, will into blocked, after that will go into ready.
Die: After run() over.

Actually, in one moment will only run one thread, just the switch of thread is fast.

### 3. Operation of Thread

#### 3.1 Sleep of Thread

One method is to use sleep(), it needs a param to assign the time it sleeps, the unit is ms. Always be used in run().

```java
try{
	Thread.sleep(2000);
}catch(InterruptedException e){
	e.printStackTrace();
}
```

Need to use try-catch block, though the thread might be awaken once the time ends, can not garantee it enter running, maybe ready.

```java
package com.ThreadPart;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for sleep method in Thread
     * @author: Log1c
     * @create: 2021-12-12 00:12
     **/
    private Thread t;
    private static Color[] color = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW, Color.RED, Color.PINK, Color.LIGHT_GRAY};// Create color array
    private static final Random rand = new Random();

    private static Color getC(){    // get random color
        return color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
        setVisible(true);
        t = new Thread(new Runnable() { // create anonymous thread obj
            int x = 300;
            int y = 500;
            public void run(){
                while(true){
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    Graphics graphics = getGraphics(); // get component
                    graphics.setColor(getC());
                    graphics.drawLine(x, y, 100, y++);  // draw line and add vertical coordinate
                    if(y>=300){
                        y = 50;
                    }
                }
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(), 500, 400);
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
    }
}
```

#### 3.2 Join of Thread

If exists a thread A, now we need to insert a thread B and require B execute and finish first, use join().

```java
package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for join() method
     * @author: Log1c
     * @create: 2021-12-12 01:38
     **/
    private Thread threadA;
    private Thread threadB; // create two threads
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(), 100, 100);
    }

    public JoinTest(){
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        progressBar.setStringPainted(true); // set integrate with progressbar
        progressBar2.setStringPainted(true);
        // Use anonymous inner class
        threadA = new Thread(new Runnable() {
            int count = 0;
            public void run(){
                while (true){
                    progressBar.setValue(++count);
                    try{
                        Thread.sleep(100);
                        threadB.join(); // let threadB call join()
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            public void run(){
                while(true){
                    progressBar2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    if (count == 100){
                        break;
                    }
                }
            }
        });
        threadB.start();
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
```

Easy to see, join() interrupt threadA and when threadB finish, threadA running again.

#### 3.3 Interrupt of Thread

In the past, use stop() method to interrupt a thread. But the JDK now has already abolished it.
Now advocate to set a endless loop inside run() and use a boolean to control its stop.

```java
package com.ThreadPart;

public class InterruptedTest implements Runnable {
    /**
     * @program: Core
     * @description: A demo for how to stop a thread
     * @author: Log1c
     * @create: 2021-12-12 16:27
     **/
    private boolean isContinue = false; // set a mark value
    private int count = 0;
    public void run(){
        while(true){
            System.out.println(count++);
            if(isContinue){
                break;
            }
            if(count >= 100){
                setContinue();
            }
        }
    }
    public void setContinue(){
        this.isContinue = true;
    }

    public static void main(String[] args) {
        new Thread(new InterruptedTest()).start();
    }
}
```

The second way is to use interrupt() method, at the same time, will throw InterruptedException.

```java
package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
    /**
     * @program: Core
     * @description: A demo for using interrupt() to stop a thread
     * @author: Log1c
     * @create: 2021-12-12 16:35
     **/
    Thread thread;

    public static void main(String[] args) {
         init(new InterruptedSwing(), 100, 100);
    }

    public InterruptedSwing(){
        super();
        final JProgressBar progressBar = new JProgressBar();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);
        thread = new Thread(new Runnable() {
           int count = 0;
           public void run() {
               while(true){
                   progressBar.setValue(++count);
                   try{
                       thread.sleep(1000);
                   }catch(InterruptedException e){
                       System.out.println("The current thread was interrupted");
                       break;
                   }
               }
           }
        });
        thread.start();
        thread.interrupt();
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
```

#### 3.4 Yield of Thread

### 4. Priority of Thread

Thread Class contains member variables to represent the priorities of threads:
Thread.MIN_PRIORITY (constant 1), 
Thread.NORM_PRIORITY (constant 5), 
Thread.MAX_PRIORITY (constant 10).
Default priority is 5, and every thread is between min~max.

Use setPriority() to set priority for thread, may throw IllegalArgumentException.

```java
package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for setting priority for threads
     * @author: Log1c
     * @create: 2021-12-12 17:12
     **/
    Thread threadA;
    Thread threadB;
    Thread threadC;
    Thread threadD;

    public PriorityTest(){
        super();
        final JProgressBar progressBar = new JProgressBar();
        final JProgressBar progressBar2 = new JProgressBar();
        final JProgressBar progressBar3 = new JProgressBar();
        final JProgressBar progressBar4 = new JProgressBar();
        setLayout(new GridLayout(4, 1, 5, 5));
        getContentPane().add(progressBar);
        getContentPane().add(progressBar2);
        getContentPane().add(progressBar3);
        getContentPane().add(progressBar4);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);

        threadA = new Thread(new MyThread(progressBar));
        threadB = new Thread(new MyThread(progressBar2));
        threadC = new Thread(new MyThread(progressBar3));
        threadD = new Thread(new MyThread(progressBar4));
        setPriority("threadA", 5, threadA);
        setPriority("threadB", 5, threadB);
        setPriority("threadC", 4, threadC);
        setPriority("threadD", 3, threadD);
    }

    public static void setPriority(String threadName, int priority, Thread t){
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    public static void main(String[] args) {
        init(new PriorityTest(), 500, 500);
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

    private final class MyThread implements Runnable{
        private final JProgressBar bar;
        int count = 0;
        private MyThread(JProgressBar bar){
            this.bar = bar;
        }
        public void run() {
            while (true){
                bar.setValue(count+=10);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("The current thread was interrupted");
                }
            }
        }
    }
}
```

### 5. Synchronization of Threads

#### 5.1 Thread Safety

Actually, the problem is from 2 threads store single obj's data at the same time.

```java
package com.ThreadPart;

public class ThreadSafeTest implements Runnable {
    /**
     * @program: Core
     * @description: A demo for testing thread safety
     * @author: Log1c
     * @create: 2021-12-12 17:32
     **/
    int num = 10;
    public void run(){
        while (true){
            if(num>0){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Tickets " + num--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
```

Codes above shows the conflict of 4 threads

#### 5.2 Thread Synchronization

Generall, in order to solve the problem above, we need to give a lock to the shared resource, allow one thread visits it in certain time period.

##### 5.2.1 Sychronization Block

Sychronization mechanism use **sychronized** keyword

```java
package com.ThreadPart;

public class ThreadSafeTest2 implements Runnable{
    /**
     * @program: Core
     * @description: A right way to use synchronized
     * @author: Log1c
     * @create: 2021-12-12 18:23
     **/
    int num = 10;
    public void run(){
        while (true){
            synchronized(""){
                if(num>0){
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Tickets " + --num);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
```

The demo above shows how to use synchronized block to lock the resource.

##### 5.2.2 Synchronizing Method

Just use **synchronized** keyword.

```java
synchronized void f(){}
```

After calling a synchronized method, the other synchronized method in the obj must wait it finished.
Must use this in each method which can visit shared resource.

```java
package com.ThreadPart;

public class ThreadSafeTest2 implements Runnable{
    /**
     * @program: Core
     * @description: A right way to use synchronized
     * @author: Log1c
     * @create: 2021-12-12 18:23
     **/
    int num = 10;

    public synchronized void doit(){
        if(num>0){
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Tickets " + --num);
        }
    }

    public void run(){
        while (true){
            doit();
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
```

## X Network Communication

### 1. Network Programming Basic

#### 1.1 Networking Protocol

**IP Protocol**:

Abbreviation of Internet Protocol. Internet uses TCP/IP protocol, full name is Transmission Control Protocol/Internet Protocol.
Four-layer: application layer, transport layer, internet layer, network layer.

**TCP and UDP**:

In TCP/IP protocol stack, there are 2 important advanced protocol:
TCP: Transmission Control Protocol;
UDP: User Datagram Protocol.

#### 1.2 Ports and Sockets

Socket is used to connect the program with the port.

### 2. TCP Programming Basic

TCP Programming uses Socket class to code. Server and Client

#### 2.1 InetAddress Class

Inside the java.net package, associate with IP address.

```java
package com.NetworkProgramming;

import java.net.*;

public class Address {
    /**
     * @program: Core
     * @description: Use InetAddress to get some attr
     * @author: Log1c
     * @create: 2021-12-13 17:01
     **/
    public static void main(String[] args) {
        InetAddress ip;     // create its obj
        try{
            ip = InetAddress.getLocalHost();    // Instantiate obj
            String localName = ip.getHostName();    // get local host's name
            String localIp = ip.getHostAddress();   // get local host's IP addr
            System.out.println("Local Host's Name: " + localName);
            System.out.println("Local Host's Address: " + localIp);
//            getByName(String host); get the InetAddress obj by name
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
```

#### 2.2 ServerSocket Class

Also inside java.net, function is to wait the request from network, can be assigned to certain port.
WARNING: At one time, can only connect one socket !

**Constructor**(will throw IOException):
ServerSocket(): create a unbinding server socket
ServerSocket(int port): create a server socket binding to certain port
ServerSocket(int port, int backlog): ditto, but use certain backlog to create
ServerSocket(int port, int backlog, InetAddress bindAddress): ditto, but bind to local IP addr

**Common Methods:**
Page 348

#### 2.3 TCP Network Program

```java
package com.NetworkProgramming;

import java.io.*;
import java.net.*;

public class MyTcp {
    /**
     * @program: Core
     * @description: A TCP Server, get Client's message
     * @author: Log1c
     * @create: 2021-12-13 17:13
     **/
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;

    void getServer(){
        try{
            server = new ServerSocket(8998);       // Instantiate Socket obj
            System.out.println("Successfully create ServerSocket");
            while (true){
                System.out.println("Waiting for Client...");
                socket = server.accept();       // Instantiate Socket obj
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));        // instantiate
                getClientMessage();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void getClientMessage(){
        try{
            while(true){
                System.out.println("Client: " + reader.readLine()); // get Client's message
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();
            }
            if(socket!=null){
                socket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }
}
```

```java
package com.NetworkProgramming;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class MyClient extends JFrame {
    /**
     * @program: Core
     * @description: A Client for class MyTcp
     * @author: Log1c
     * @create: 2021-12-13 17:22
     **/
    private PrintWriter writer;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    
    public MyClient(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cc = this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf, "South");
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                writer.println(tf.getText());
                ta.append(tf.getText() + "\n");
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }

    private void connect(){
        ta.append("Trying to connect...\n");
        try{
            socket = new Socket("localhost ", 8998);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append(socket.getInetAddress().getHostName() + "Connected\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClient client = new MyClient("Send message to the Server");
        client.setSize(300, 300);
        client.setVisible(true);
        client.connect();
    }
}
```

### 3. UDP Programming Basic

**Basic Step of UDP Communication:**
(1) Pack the data and sent to the destination;
(2) Receive the data package, and read.

**Sending data packages:**
(1) Use DatagramSocket() to create a socket;
(2) Use DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port) to create a package;
(3) Use send() to send it.

**Receiving data package:**
(1) Use DatagramSocket(int port) to create a socket and bind it to certain port;
(2) Use DatagramPacket(byte[] buf, int length) to create a byte array to receive;
(3) Use receive() to rececvie.

























