package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon { // implements Icon interface
    /**
     * @program: Core
     * @description: A demo for using Icon
     * @author: Log1c
     * @create: 2021-11-24 22:02
     **/
    private int width;
    private int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIcon(int width, int height){
        this.width = width;
        this.height = height;
    }
    // override paintIcon()
    public void paintIcon(Component arg0, Graphics arg1, int x, int y){
        arg1.fillOval(x, y, width, height);
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel jl = new JLabel("Test", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame("FY");
        Container c = jf.getContentPane();
        c.add(jl);
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
