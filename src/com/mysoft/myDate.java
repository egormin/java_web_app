package com.mysoft;

import java.text.SimpleDateFormat;
import java.util.Date;

public class myDate {
    public static Date get() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        return date;
    }
}
