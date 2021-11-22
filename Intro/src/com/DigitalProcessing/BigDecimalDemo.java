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
