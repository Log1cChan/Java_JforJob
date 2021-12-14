package com.SomeAdvancedFeatures;

import java.util.Random;

class Test {
    int i = 0;
}

public class FinalData {
    /**
     * @program: Core
     * @description: A demo of final keyword, btw I didnt finish it.
     * @author: Log1c
     * @create: 2021-11-24 15:26
     **/
    static Random rand = new Random();
    private final int VALUE_1 = 9;
    private static final int VALUE_2 = 10;
    private final Test test = new Test();
    private Test test2 = new Test();
    private final int[] a = {1, 2, 3, 4, 5};
    private final int i4 = rand.nextInt(20);
    private static final int i5 = rand.nextInt(20);
    public String toString() {
        return i4 + " " + i5 + " ";
    }

    public static void main(String[] args) {
        FinalData data = new FinalData();

    }
}
