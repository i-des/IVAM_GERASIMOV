package ru.mirea.task14.number5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String date1 = "29/02/2000";
        String date2 = "30/04/2003";
        String date3 = "01/01/2003";
        String date4 = "29/02/2001";
        String date5 = "30-04-2003";
        String date6 = "1/1/1899";

        // Проверка строк на соответствие формату даты
        boolean isValid1 = isValidDate(date1);
        boolean isValid2 = isValidDate(date2);
        boolean isValid3 = isValidDate(date3);
        boolean isValid4 = isValidDate(date4);
        boolean isValid5 = isValidDate(date5);
        boolean isValid6 = isValidDate(date6);

        System.out.println("Дата1 - верна: " + isValid1); // true
        System.out.println("Дата2 - верна: " + isValid2); // true
        System.out.println("Дата3 - верна: " + isValid3); // true
        System.out.println("Дата4 - верна: " + isValid4); // false
        System.out.println("Дата5 - верна: " + isValid5); // false
        System.out.println("Дата6 - верна: " + isValid6); // false
    }

    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        return matcher.matches();
    }
}

