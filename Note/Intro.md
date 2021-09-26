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

### 1. 















