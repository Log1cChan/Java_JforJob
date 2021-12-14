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
