package com.xsh.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    }
}
