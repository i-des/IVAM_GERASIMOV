package ru.mirea.task2.number10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        int q = 1;
        boolean f = false;
        while (!f) {
            f = true;
            for (int i = 0; i < (s.length() - 1); i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                    s = s.replace("  ", " ");
                    f = false;
                }
            }
        }
//        System.out.println(s);
        for (int i = 1; i<(s.length()-1); i++){
            if (s.charAt(i-1) != ' ' && s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                q++;
            }
        }
        System.out.println("Строка состоит из " + q + " слов");
    }
}
