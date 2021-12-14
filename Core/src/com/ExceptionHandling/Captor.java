package com.ExceptionHandling;

public class Captor {
    /**
     * @program: Core
     * @description: A demo for throw
     * @author: Log1c
     * @create: 2021-11-24 17:26
     **/
    static int quotient(int x, int y)throws MyException1 {
        if (y<0){
            throw new MyException1("divisor can't be negaive");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try{
            int result = quotient(3, -1);
        }catch(MyException1 e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("divisor can't be negaive");
        }catch(Exception e){
            System.out.println("Other Exception");
        }
    }
}
