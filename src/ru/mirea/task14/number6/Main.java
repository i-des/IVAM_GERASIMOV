package ru.mirea.task14.number6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "root@localhost";
        String email3 = "myhost@@@com.ru";
        String email4 = "@my.ru";
        String email5 = "Julia String.";

        // Проверка строк на соответствие формату email
        boolean isValid1 = isValidEmail(email1);
        boolean isValid2 = isValidEmail(email2);
        boolean isValid3 = isValidEmail(email3);
        boolean isValid4 = isValidEmail(email4);
        boolean isValid5 = isValidEmail(email5);

        System.out.println("email1 верный: " + isValid1); // true
        System.out.println("email2 верный: " + isValid2); // true
        System.out.println("email3 верный: " + isValid3); // false
        System.out.println("email4 верный: " + isValid4); // false
        System.out.println("email5 верный: " + isValid5); // false
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
