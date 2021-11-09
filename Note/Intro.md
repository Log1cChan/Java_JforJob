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



















