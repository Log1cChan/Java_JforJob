package com.Intro;

import java.util.Date;

public class dateAndTime {
    /**
    * @Description: Using format to format date
    * @Author: Log1c
    * @Date: 2021/11/9
    */
    public void dateFormating(){
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        System.out.println(year + " " + month + " " + day);
    }

    public void timeFormatting(){
        /**
        * @Description: formating time
        * @Author: Log1c
        * @Date: 2021/11/9
        */
        Date date = new Date();
        String p = String.format("%tp", date);
        String hour = String.format("%tH", date);
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
        System.out.println(hour + ":" + minute + ":" + second + " " + p);
    }

    public void commonFormat(){
        /**
        * @Description: Common format of date and time
        * @Author: Log1c
        * @Date: 2021/11/9
        */
        Date date = new Date();
        String time = String.format("%tc", date);
        String form = String.format("%tF", date);
        System.out.println(time);
        System.out.println(form);
    }


    public static void main(String[] args){
        dateAndTime d = new dateAndTime();
        d.dateFormating();
        d.timeFormatting();
        d.commonFormat();
    }


}
