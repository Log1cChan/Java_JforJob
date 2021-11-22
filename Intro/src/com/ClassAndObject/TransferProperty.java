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
