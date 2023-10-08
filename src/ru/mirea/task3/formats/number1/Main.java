package ru.mirea.task3.formats.number1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();

        System.out.print("\nВыберите Вашу валюту (2-Доллар, 3-Евро, 4-Юань)");
        int q = scan.nextInt();
        Locale locFR = new Locale("ru");
        Locale.setDefault(Locale.US);

        if (q == 2){
            NumberFormat numberFormat1 = NumberFormat.getInstance();
        }
    }
}
