package com.IOPart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ftest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for FileReader and FileWriter
     * @author: Log1c
     * @create: 2021-11-28 15:06
     **/
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;

    private JButton getOpenButton(){
        if(openButton == null){
            openButton = new JButton();
            openButton.setText("Write");
            openButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    File file = new File("word.txt");
                    try{
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();         // get the text inside the text area
                        out.write(s);                           // write in
                        out.close();
                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton(){
        if(closeButton == null){
            closeButton =new JButton();
            closeButton.setText("Read");
            closeButton.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   File file = new File("word.txt");
                   try{
                       FileReader in = new FileReader(file);
                       char byt[] = new char[1024];
                       int len = in.read(byt);                          // read from
                       jTextArea.setText(new String(byt, 0, len));
                       in.close();
                   }catch(Exception e1){
                       e1.printStackTrace();
                   }
               }
            });
        }
        return closeButton;
    }

    public Ftest(){
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    public JTextArea getJTextArea(){
        if(jTextArea==null){
            jTextArea = new JTextArea();
        }
        return jTextArea;
    }

    public JPanel getControlPanel(){
        if(controlPanel == null){
            controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(1, 2));
            controlPanel.add(getOpenButton());
            controlPanel.add(getCloseButton());
        }
        return controlPanel;
    }

    private JPanel getJContentPane(){
        if(jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJTextArea(), BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public static void main(String[] args) {
        Ftest thisClass = new Ftest();
        thisClass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }
}
