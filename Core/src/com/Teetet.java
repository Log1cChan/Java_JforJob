package com;

public class Teetet {
    /**
     * @program: Core
     * @description: A class for test
     * @author: Log1c
     * @create: 2021-11-30 14:58
     **/
    private int[] a;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Teetet t = new Teetet();
        int[] a = {1, 2, 3, 4};
        t.setA(a);
        for (int i = 0; i<t.getA().length; i++){
            System.out.println(t.getA()[i]);
        }
    }
}
