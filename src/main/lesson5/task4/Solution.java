package main.lesson5.task4;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {

    public static void main(String args[]) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}




