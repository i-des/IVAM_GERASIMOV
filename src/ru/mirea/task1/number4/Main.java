package ru.mirea.task1.number4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Задание №4\nВведите размер массива: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++){
            System.out.printf("Введите " + (i+1) + "-ый элемент массива: ");
            B[i] = sc.nextInt();
            if (B[i] > max){
                max = B[i];
            }
            if (B[i] < min){
                min = B[i];
            }
            if (i == 0){
                min = B[i];
            }
        }
        System.out.println("Минимальный элемент: " + min + "\nМаксимальный эелемент: " + max);
    }
}
