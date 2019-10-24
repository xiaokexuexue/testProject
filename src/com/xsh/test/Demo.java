package com.xsh.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @auther: xueshh
 * @date: 2019/10/25 00:00
 */

public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);

        Calendar calendar = Calendar.getInstance();
        Date time1 = calendar.getTime();
        String format = sdf.format(time1);
        System.out.println(format);

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
