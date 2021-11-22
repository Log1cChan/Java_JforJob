package com.DigitalProcessing;

import java.text.DecimalFormat;

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
