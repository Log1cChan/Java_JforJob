package com.CoreBasic;

interface drawTest{
    public void draw();
}

class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("Parallelogram.draw()");
    }
    void doAnything(){
        //
    }
}

class SqureUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw() {

    }
    void doAnyThing(){
        //
    }
}

class AnyThingUseInterface extends QuadrangleUseInterface{
    void doAnyThing(){
        //
    }
}

public class QuadrangleUseInterface {
    /**
     * @program: Core
     * @description: A demo for interface ez
     * @author: Log1c
     * @create: 2021-11-23 17:12
     **/
    public void doAnyTthing(){
        //
    }

    public static void main(String[] args) {
        drawTest[] d ={new SqureUseInterface(), new ParallelogramgleUseInterface()};
        for (int i=0; i<d.length; i++){
            d[i].draw();
        }
    }
}
