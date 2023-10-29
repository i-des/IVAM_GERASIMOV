package ru.mirea.task11.number1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        String developerName = "Герасимов";
        SimpleDateFormat sdf = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        cal.set(Calendar.DST_OFFSET, 3);
        cal.set(Calendar.YEAR,2023);
        cal.set(Calendar.MONTH,Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH,13);
        cal.set(Calendar.ERA,Calendar.AM);
        cal.set(Calendar.HOUR, -2);
        cal.set(Calendar.MINUTE,2);
        cal.set(Calendar.SECOND,5);
//        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
//        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
//        System.out.println(" Date with month changed :" + sdf.format(cal.getTime()));
//        cal.set(Calendar.DAY_OF_MONTH,30);
//        System.out.println(" Date with day changed:" + sdf.format(cal.getTime()));

        long assignmentEndTime = System.currentTimeMillis();   // Время сдачи задания, можно установить фактическую дату и время

        Date endDate = new Date(assignmentEndTime);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + sdf.format(cal.getTime()));
        System.out.println("Дата и время сдачи задания: " + endDate);
    }

}
