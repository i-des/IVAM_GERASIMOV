package ru.mirea.task1.number7;

import java.util.Scanner;

public class Main {
    public static int fact(int x){
        int s = 1;
        for (int i = 1; i<=x; i++){
            s *= i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nЗадание №7\nВведите число: ");
        int n = sc.nextInt();
        System.out.println("Факториал числа " + n + " = " + fact(n));
    }
}
