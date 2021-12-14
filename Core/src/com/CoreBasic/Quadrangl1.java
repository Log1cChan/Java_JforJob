package com.CoreBasic;

public class Quadrangl1 {
    /**
     * @program: Core
     * @description: A demo for Polymorphism
     * @author: Log1c
     * @create: 2021-11-22 22:05
     **/
    private Quadrangl1[] qtest = new Quadrangl1[6];
    private int nextIndex = 0;
    public void draw(Quadrangl1 q){
        if (nextIndex < qtest.length){
            qtest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        Quadrangl1 q = new Quadrangl1();
        q.draw(new Square());
        q.draw(new Parallelogram());
    }
}

class Square extends Quadrangl1 {
    public Square(){
        System.out.println("Square");
    }
}

class Parallelogram extends Quadrangl1{
    public Parallelogram(){
        System.out.println("Parallelogram");
    }
}

