package com.kuang.lesson02;

import java.sql.Date;
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.toLocalDate());
    }
}
