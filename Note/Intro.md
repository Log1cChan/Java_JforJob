# Intro Part of Java (Basic)

---

[TOC]

## I Data Type

Eight 8 basic datatype
Value: 
Integral: byte, short, intm long, 
Float: float, double
char, bool

| DataType | Storage |
| -------- | ------- |
| byte     | 8       |
| short    | 16      |
| int      | 32      |
| long     | 64      |
| float    | 32      |
| doubble  | 64      |

### 1. Constant

is a final variable which cant be changed during ...

```java
final DataType VariableName [= Value]
```

### 2. Effective Range

#### 2.1. Member Variable

Define in a class, valid in the whole class
**Instance Variable** 实例变量
**Static Variable** 静态变量: 有效范围可以跨类。甚至可以达到整个应用程序之内

```java
int x = 45; // Instance
static int y = 90; // Static
```

#### 2.2. Local Variable

Define in a function in a class, valid in the function blocks

### 3. Data Type Conversion

#### 3.1. Implicit Conversion 隐式转换

Converse from Low Type to High Type:
byte<short<int<long<float<double

#### 3.2. Explicit Conversion 显式转换

Converse from High Type to Low Type:

```java
(DataType) Value;
int a = (int)45.23;
```

WARNING: May cause Precision Loss 精度丢失

## II String

### 1. Creating & Initializing

```java
char a[] = {'g', 'o', 'o', 'd'};
String s = new String(a);
// String s = new String("good")
```

Also: String(char a[], int offset, int length);  // offset: 截取字符位置 length: 长度

### 2. Get String Info

#### 2.1 Get Length

```java
str.length();
```

#### 2.2 Find

##### 2.2.1 indexOf(String s)

返回参数字符串s在制定字符串中首次出现的索引位置   str.indexOf(substr) 没有检测到则返回-1

##### 2.2.2 lastIndexOf(String str)

返回指定字符串最后一次出现的索引位置，调用时，从结尾处右向左查找指定字符串 str.lastIndexOf(substr)

##### 2.2.3 charAt()

返回指定索引处的字符 	str.charAt(int index);

### 3. String Operations

#### 3.1 Get substring

```java
str.substring(int beginIndex); // Get substring from the begin Index
str.substring(int beginIndex, int endIndex); // Return the certain section's substring
```

#### 3.2 Remove Space

**trim()** : return the copy of string and ignore the space front and back

```java
str.trim(); // 去掉前导和尾部空格后的结果输出
```

#### 3.3 Replace

**replace()** : Replace certain char or string with new char or string

```java
str.replace(char oldChar, char newChar);
```

#### 3.4 Start and End

**startsWith()**: Judge if the string starts with certain content
**endsWith()**: Judge if the string ends with certain content

```java
str.startsWith(String prefix);
str.endsWith(String suffix);
```

#### 3.5 Equal

**Warn:** Can't just use "==" to judge, cos this is for address, not for value

**equals():** if 2 strings have same chars and length, return true
**equalsIgnoreCase():** Ignore the case and compare 2 strings ditto

```java
str.equals(String otherstr);
str.equalsIgnoreCase(String otherstr);
```

#### 3.6 Compare 2 strings due to order of dic

**compareTo():** base on unicode and compare, if String object in front of param, return a negative int, else, positive. if equal, 0

```java
str.compareTo(String otherstr);
```

#### 3.7 Converse Case

**toLowerCase() & toUpperCase()**

#### 3.8 Split

**split(String sign): **Split string using the certain sign, return a string array!!!
**split(String sign, int limit): **limit how many times it may split, ditto.

### 4. Formatting String

**format(String format, Object...args)**: Using certain format and param, return a formatting string, new string will be local
**format(Local l, String format, Object...args)**: l: language env, if = null, not localize

#### 4.1 Date & Time *Page No93*

```java
Date date = new Date();
String s = String.format("%te", date) 	// formatting date
  
 public void commonFormat(){
        /**
        * @Description: Common format of date and time
        * @Author: Log1c
        * @Date: 2021/11/9
        */
        Date date = new Date();
        String time = String.format("%tc", date);
        String form = String.format("%tF", date);
        System.out.println(time);
        System.out.println(form);
    }
```

#### 4.2 Regular Type Formatting *Page No.95*

### 5. StringBuilder

StringBuilder is an object to create string, initialized capacity is 16 chars.

append(content): append string into
insert(int offset, arg): inset arg into the position offset
delete(int start, int end): from start to end--delete

```java
StringBuilder bf = new StringBuilder("StringBuilder");
bf.append("123");
System.out.println(bf.toString());
bf.insert(5, "world");
System.out.println(bf.toString());
bf.delete(5, 10);
System.out.println(bf.toString());
```

## III Array

### 1. Create & Initialize one-dimensional array

#### 1.1 Create an one-dimensional array

```java
// Declare first and then use new to allocate storage
int arr[];
arr = new int[5];

// Declare and allocate in the same time
int month[] = new int[12];
```

#### 1.2 Initialize an array

```java
// First method
int arr[] = new int[]{1,2,3,4,5};
// Second method
int arr2[] = {1,2,3,4,5};
```

### 2. Create and Use a two-dimensional array

#### 2.1 Create

```java
// Declare and Allocate
int myarr[][];
// Allocate for every dimension directly
a = new int[2][4];
// Allocate respectively
a = new int[2][];
a[0] = new int[2];
a[1] = new int[3];
```

#### 2.2 Initialize

**Grammar:** type arrayname/[]/[] = {value1, value2, ...};

```java
int myarr[][] = {{2,10},{1,2}};
```

### 3. Some Operations of Array

#### 3.1 fill and replace elements

By using static method ***fill()*** from **Arrays** class to replace 

##### 3.1.1 fill(int[] a, int value)

Distribute a certain int value to every element in array.

```java
/**
* @Description: Usage of fill method
* @Author: Log1c
* @Date: 2021/11/10
*/
int a[] = new int[5];
Arrays.fill(a, 8);
for(int i=0; i<a.length; i++){
     System.out.print(a[i]);
}// 88888
```

##### 3.1.2 fill(int[] a, int fromIndex, int toIndex, int value)

Distribute the value to certain section

```java
Arrays.fill(a, 1, 2, 3);
for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
}// 83888
```

#### 3.2 Sort the Array

By using static method ***sort()*** from class **Arrays** "**Ascending Order**"

````java
// Grammar: Arrays.sort(object)
int arr3[] = new int[]{23, 42, 12, 6};
Arrays.sort(arr3);
for(int i=0; i<arr3.length; i++)
   System.out.print(arr3[i] + " ");
// 6 12 23 42 
````

#### 3.3 Copy the Array

Use method **copyOf()** and **copyOfRange()** can copy the Array
**copyOf(arr, int newlength):** Copy the certain length, if *newlength* > length, fill with 0
**copyOfRange(arr, int fromIndex, int toIndex)**

```java
/**
        * @Description: Usage of two methods in copying Array
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        // 1. copyOf
        int arr4[] = new int[]{23, 42, 12};
        int newarr[] = Arrays.copyOf(arr4, 5);
        for (int i=0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
        System.out.println();
        // 2. copyOfRange
        int arr5[] = new int[]{23, 42, 12, 84, 10};
        int newarr1[] = Arrays.copyOfRange(arr5, 0, 3);
        for (int i=0; i< newarr1.length; i++){
            System.out.print(newarr1[i] + " ");
        }
```

#### 3.4 Array Search

Using the **binarySearch()** method in class Arrays to search specified array. There are two param type.
**binarySearch(Object[] a, Object key):** if key is in the a, return the index, else return -1 or "-"(the insert pos)
**binarySearch(Object[]a, int fromIndex, int toIndex, Object key)**: Search in certain section

```java
/**
        * @Description: Usage of binarySearch()
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        // binarySearch(Object[] a, Object key)
        int ia[] = new int[]{1, 8, 9, 4, 5};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia, 4);
        System.out.println("Index of 4: " + index);
        //binarySearch(Object[]a, int fromIndex, int toIndex, Object key)
        String str[] = new String[]{"ab", "cd", "ef", "yz"};
        Arrays.sort(str);
        int index1 = Arrays.binarySearch(str, 0, 2, "cd");
        System.out.println("Index of cd: " + index1);
```

### 4. Array Sort Algorithm

#### 4.1 Bubble Sort

By comparing the a adjacent element's value, if 1, swap pos.

```java
// 1. Bubble Sort
        int[] sa = new int[]{63, 4, 24, 1, 3, 15};
        for (int i=1; i<sa.length; i++){
            for (int j=0; j<sa.length-i; j++){
                if(sa[j]>sa[j+1]){
                    int temp = sa[j];
                    sa[j] = sa[j+1];
                    sa[j+1] = temp;
                }
            }
        }
        for (int i=0; i<sa.length; i++){
            System.out.print(sa[i] + " ");
        }
        System.out.println();
        // 1 3 4 15 24 63
```

#### 4.2 Straight Selection Sort

Compare the value in certain pos to other elements in the array, if 1, swap.

```java
// 2. Select Sort
        int[] sa1 = new int[]{63, 4, 24, 1, 3, 15};
        int index2;
        for (int i=1; i<sa1.length; i++){
            index2 = 0;
            for (int j=1; j<=sa1.length-i; j++){
                if(sa1[j] > sa1[index2]){
                    index2 = j;
                }
            }
            int temp1 = sa1[sa1.length-i];
            sa1[sa1.length-i] = sa1[index2];
            sa1[index2] = temp1;
        }
        for (int i=0; i<sa1.length; i++){
            System.out.print(sa1[i] + " ");
        }
```

#### 4.3 Reverse Sort

Swap the first with the last and so on. Too stupid.

## IV Classes and Objects

### 1. Construction Method

Has the same name as the class, when Instantiate a object from a class-->call the construction method.
**Feature:** 1. no return value; 2. same name
If there is no cm in a class, compiler will create a no param's default cm automatically.

### 2. Static Variable

If a variable/constant/method is static, it's a static member and belong to the class.
u can use classname.xxx to call the static member.
**Warning**: can't use "this" in static method; can't call nonstatic method in static method.

```java
public class StaticTest {
    /**
     * @program: Intro
     * @description: Test the static member
     * @author: Log1c
     * @create: 2021-11-11 21:42
     **/
    // static constant
    final static double PI = 3.1415;
    // static variable
    static int id;
    // static method
    public static void method1(){
        // some code
    }

    public void method2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }

    public static void main(String[] args){
        StaticTest st = new StaticTest();
        st.method2();
    }

}
```

### 3. Main Method of Class

The main method is the entry of class, defines where should the program start.

```java
public static void main(String[] args){
    // body
}
```

**Features:**
The main method is static, so if call other methods inside, should be static methods;
No return value;
Formal parameter is array.

### 4. Object

Object is abstracted from the class, can operate the methods in class to solve problems.

#### 4.1 Create an Object

In java, we use new operator to create objects.

```java
Test test = new Test();
Test test = new Test("a"); // has param
```

```java
public class CreateObject {
    /**
     * @program: Intro
     * @description: To create a f obj
     * @author: Log1c
     * @create: 2021-11-11 22:35
     **/
    public CreateObject(){
        System.out.println("Created an Obj"); // construction Func
    }
    public static void main(String args[]){
        new CreateObject(); // create obj
    }
}
```

#### 4.2 Call obj's Attr and Methods

After creating an obj, use ***obj.classMember*** to get obj's attrs and methods

```java
package com.ClassAndObject;

public class TransferProperty {
    /**
     * @program: Intro
     * @description: Description of how obj call attrs and methods
     * @author: Log1c
     * @create: 2021-11-11 22:39
     **/
    int i = 47; // Member variable
    public void call(){
        System.out.println("Calling Method \"call\"");
        for (i=0; i<3; i++){
            System.out.print(i + " ");
            if (i==2){
                System.out.println("\n");
            }
        }
    }
    // define the construction method
    public TransferProperty(){}
    // main
    public static void main(String[] args){
        TransferProperty t1 = new TransferProperty();
        TransferProperty t2 = new TransferProperty();
        t2.i = 60; // set member variable to 60
        // The first obj
        System.out.println("First obj call i: " + t1.i++);
        t1.call();
        // The second obj
        System.out.println("Second obj call i: " + t2.i++);
        t2.call();
    }

}
/**
First obj call i: 47
Calling Method "call"
0 1 2 

Second obj call i: 60
Calling Method "call"
0 1 2 
*/
```

The variable **i** is independent in each obj, if **i** is not allowed to be changed, set it a static variable, so it can share in other obj.

#### 4.3 Destroying of Objects

Every obj has lifecycle, when it's end, the storage allocated to the obj will be recalled.

**When an obj is regarded as trash:**
The quote is out of range;
The value of a obj is null.

Can use the protected func: **finalize()** to recall memory.

## V Wrapper Classes

### 1. Integer

**Integer, Long, Short classes** are in java.lang package. They are subcalsses of **Number**.

#### 1.1 Construction Method

**Integer(int number):** Use an int variable as param to get Integer Obj
**Integer(String str):** Use an String variable as param to get Integer Obj

```java
// two kinds of Construction Func of Integer Wrapper Class
        Integer number = new Integer(7);
        Integer number1 = new Integer("45");
// 7 45
```

## VI Digital Processing Classes

### 1. DecimalFormat Class Page155

Use ***java.text.DecimalFormat*** to formatting number, especially float.

```java
public class DecimalFormatSimpleDemo {
    /**
     * @program: Intro
     * @description: A demo for decimal formating
     * @author: Log1c
     * @create: 2021-11-12 17:19
     **/
    // Instantiate Object and set format pattern the same time
    static public void SimgleFormat(String pattern, double value){
        DecimalFormat myFormat = new DecimalFormat(pattern); // Instantiate
        String output = myFormat.format(value); // Formatting the num
        System.out.println(value + " " + pattern + " " + output);
    }

    // Use applyPattern() to format num after Instantiate obj
    static public void UseApplyPatternMethodFormat(String pattern, double value){
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.applyPattern(pattern);
        System.out.println(value + " " + pattern + " " + myFormat.format(value));
    }

    public static void main(String[] args){
        SimgleFormat("###,###.###", 123456.789);
        SimgleFormat("000000.###kg", 123456.789);
        SimgleFormat("000000.000", 123.78);
        UseApplyPatternMethodFormat("#.###%", 0.789);
        UseApplyPatternMethodFormat("###.##", 123456.789);
        UseApplyPatternMethodFormat("0.00\u2030", 0.789);
    }
}
//123456.789 ###,###.### 123,456.789
//123456.789 000000.###kg 123456.789kg
//123.78 000000.000 000123.780
//0.789 #.###% 78.9%
//123456.789 ###.## 123456.79
//0.789 0.00‰ 789.00‰
```

### 2. Math Class

Basic mathematical operation class ***Math***: trigonometric function etc.

#### 2.1 Common Method

**Trigonometric Function** : be like: ***public static double sin(double a);***

```java
public class TrigonometricFunction {
    /**
     * @program: Intro
     * @description: Usage of Trigonometric Funcs
     * @author: Log1c
     * @create: 2021-11-12 17:38
     **/

    public static void main(String[] args){
        System.out.println("sin90º = " + Math.sin(Math.PI/2));
        System.out.println("cos0º = " + Math.cos(0));
        System.out.println("tan60º = " + Math.tan(Math.PI/3));
        System.out.println("arcsin(sqrt(2)/2) = " + Math.asin(Math.sqrt(2)/2));
        System.out.println("arccos(sqrt(2)/2) = " + Math.acos(Math.sqrt(2)/2));
        System.out.println("arctan1 = " + Math.atan(1));
        System.out.println("radius of 120º = " + Math.toRadians(123.0));
        System.out.println("Degree of π/2 = " + Math.toDegrees(Math.PI/2));
    }
}
//sin90º = 1.0
//cos0º = 1.0
//tan60º = 1.7320508075688767
//arcsin(sqrt(2)/2) = 0.7853981633974484
//arccos(sqrt(2)/2) = 0.7853981633974483
//arctan1 = 0.7853981633974483
//radius of 120º = 2.1467549799530254
//Degree of π/2 = 90.0

```

**Exponential Function**: be like: ***public static double exp(double a);***

```java
public class ExponentFunction {
    /**
     * @program: Intro
     * @description: Usage of Exponent Function
     * @author: Log1c
     * @create: 2021-11-12 17:47
     **/
    public static void main(String[] args){
        System.out.println("The square of e = " + Math.exp(2));
        System.out.println("lg2 = " + Math.log(2)); // No log2! it's lg2
        System.out.println("log10 2 = " + Math.log10(2));
        System.out.println("squre root of 4 = " + Math.sqrt(4));
        System.out.println("cube root of 8 = " + Math.cbrt(8));
        System.out.println("squre of 2 = " + Math.pow(2, 2));
    }
}
/*
The square of e = 7.38905609893065
lg2 = 0.6931471805599453
log10 2 = 0.3010299956639812
squre of 4 = 2.0
cube of 8 = 2.0
squre of 2 = 4.0
*/
```

**Integral Function**: be like: ***public static double ceil(double a);***

````java
public class IntFunction {
    /**
     * @program: Intro
     * @description: Usage of Integral Function
     * @author: Log1c
     * @create: 2021-11-16 21:34
     **/

    public static void main(String[] args){
        // Return the first Integer >= param
        System.out.println(Math.ceil(5.2));
        // Return the first Integer <= param
        System.out.println(Math.floor(2.5));
        // Return a Integer which is the closest
        System.out.println(Math.rint(2.7));
        System.out.println(Math.rint(2.5));
        // Return a Integer which is close to the param+0.5
        System.out.println(Math.round(3.4f));
    }
}
/*
6.0
2.0
3.0
2.0
3
*/
````

**Functions of getting maximum, minimum and absolute value**

```java
public class AnyFunction {
    /**
     * @program: Intro
     * @description: Maximum, Minimum and Absolute Value
     * @author: Log1c
     * @create: 2021-11-16 21:39
     **/
    public static void main(String[] args){
        System.out.println(Math.max(4, 8));
        System.out.println(Math.min(4.4, 4));
        System.out.println(Math.abs(-7));
    }
}
/*
8
4.0
7
*/
```

### 3. Random Number

#### 3.1 Math.random()

**random()** method is in class Math, for creating random number. *Default: 0.0 =< double <1.0.* 
**Usage of random():**

```java
public class MathRandom {
    /**
     * @program: Intro
     * @description: Usage of Math.random()
     * @author: Log1c
     * @create: 2021-11-16 21:46
     **/
    public static int GetEvenNum(double num1, double num2){
        /**
        * @Description:  Generate a random even number in the range of num1-num2
        * @Param: [num1, num2]
        * @return: int
        */
        int s = (int)num1 + (int)(Math.random() * (num2-num1));
        if(s % 2 == 0){
            return s;
        }else{
            return s + 1;
        }
    }

    public static void main(String[] args){
        System.out.println("A random even number in the range of 2 to 32: " + GetEvenNum(2, 32));
    }
}
/*
A random even number in the range of 2 to 32: 22
*/
```

#### 3.2 Class Random

In addition to the random() method, also ***java.util.Random***, can instantiate
**Random r = new Random(); :** Use the system current time as the seedValue
**Random r m new Random(seedValue); : ** Set seedValue yourself
Also there are some more methods in Random: nextInt(), nextGaussian()...

```java
import java.util.Random;

public class RandomDemo {
    /**
     * @program: Intro
     * @description: A demo of using some funcs in Class Random
     * @author: Log1c
     * @create: 2021-11-16 21:56
     **/
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Random Integer: " + r.nextInt());
        System.out.println("Random Integer in the range of 0 to 10: " + r.nextInt(10));
        System.out.println("Random Boolean: " + r.nextBoolean());
        System.out.println("Random Double: " + r.nextDouble());
        System.out.println("Random Float: " + r.nextFloat());
        System.out.println("Random Double which probability density is gaussian: " + r.nextGaussian());
    }
}
/*
Random Integer: 1018333148
Random Integer in the range of 0 to 10: 5
Random Boolean: false
Random Double: 0.7484070496670691
Random Float: 0.18115091
Random Double which probability density is gaussian: -0.42673010039173953
*/
```

### 4. Big Num Page165

Java provides Big Number Operation Classes, like: java.math.BigInteger and java.math.BigDecimal (literal meaning)

#### 4.1 BigInteger

The BigInteger can support integer >= 2^31-1
**Initialization:** public BigInteger(String val)
**Demo:**

```java
import java.math.BigInteger;

public class BigIntegerDemo {
    /**
     * @program: Intro
     * @description: Demo for some methods in class BigInteger
     * @author: Log1c
     * @create: 2021-11-16 22:08
     **/
    public static void main(String[] args) {
        BigInteger bigInstance = new BigInteger("4");
        System.out.println("Add: " + bigInstance.add(new BigInteger("2")));
        System.out.println("Subtract: " + bigInstance.subtract(new BigInteger("2")));
        System.out.println("Multiply: " + bigInstance.multiply(new BigInteger("2")));
        System.out.println("Divide: " + bigInstance.divide(new BigInteger("2")));
        System.out.println("Divide and Remainder(quotient[0]): " + bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
        System.out.println("Divide and Remainder(remainder[1]): " + bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
        System.out.println("Square: " + bigInstance.pow(2));
        System.out.println("Opposite number" + bigInstance.negate());
    }
}
/*
Add: 6
Subtract: 2
Multiply: 8
Divide: 2
Divide and Remainder(quotient[0]): 1
Divide and Remainder(remainder[1]): 1
Square: 16
Opposite number-4
*/
```

#### 4.2 BigDecimal

Class BigDecimal can support Decimal from all precision;
**Initialization:** public BigDecimal(double val); public BigDecimal(String val);
**Demo:**

```java
package com.DigitalProcessing;

import java.math.BigDecimal;

public class BigDecimalDemo {
    /**
     * @program: Intro
     * @description: Demo for some methods in class BigDecimal
     * @author: Log1c
     * @create: 2021-11-22 16:29
     **/
    static final int location = 10;

    public BigDecimal add(double value1, double value2){
        /**
        * @Description: Add method
        * @Param: [value1, value2]
        * @return: java.math.BigDecimal
        * @Author: Log1c
        * @Date: 2021/11/22
        */
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.add(b2);
    }

    public BigDecimal sub(double value1, double value2){
        /**
        * @Description: Subtract Method
        * @Param: [value1, value2]
        * @return: java.math.BigDecimal
        * @Author: Log1c
        * @Date: 2021/11/22
        */
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.subtract(b2);
    }

    public BigDecimal mul(double value1, double value2){
        /**
        * @Description: Multiply Method
        * @Param: [value1, value2]
        * @return: java.math.BigDecimal
        * @Author: Log1c
        * @Date: 2021/11/22
        */
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.multiply(b2);
    }

    public BigDecimal div(double value1, double value2){
        /**
        * @Description: Divide Method
        * @Param: [value1, value2]
        * @return: java.math.BigDecimal
        * @Author: Log1c
        * @Date: 2021/11/22
        */
        return div(value1, value2, location); // call custom method
    }

    public BigDecimal div(double value1, double value2, int b){
        if(b < 0){
            System.out.println("b should bigger than 0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        // public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
        return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP); // rounding
    }

    public static void main(String[] args) {
        BigDecimalDemo b = new BigDecimalDemo();
        System.out.println("ADD: " + b.add(-7.5, 8.9));
        System.out.println("SUB: " + b.sub(-7.5, 8.9));
        System.out.println("MUL: " + b.mul(-7.5, 8.9));
        System.out.println("DIV & keep 10 decimal: " + b.div(10, 2));
        System.out.println("DIV & keep 5 decimal: " + b.div(-7.5, 8.9, 5));
    }

}
/*
ADD: 1.4
SUB: -16.4
MUL: -66.75
DIV & keep 10 decimal: 5.0000000000
DIV & keep 5 decimal: -0.84270
*/
```

















