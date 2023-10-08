package ru.mirea.task1.number3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Задание №3\nВведите размер массива: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        int S = 0;
        for (int i = 0; i < n; i++){
            System.out.printf("Введите " + (i+1) + "-ый элемент массива: ");
            B[i] = sc.nextInt();
            S += B[i];
//            System.out.println();
        }
        float sr = (float) S /n;
        System.out.println("Сумма = "+ S + "\nСреднее арифметическое = " + sr);
    }
}
