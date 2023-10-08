package ru.mirea.task3.MathAndRandom.number4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целочисленный размер массива: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Изначальный массив: ");
        for (int i = 0; i < n; i++){
            A[i] = rand.nextInt(0,n);
            System.out.print(A[i] + " ");
        }
        if (A.length > 1) {
            System.out.println("\nМассив из четных элементов: ");
            int[] B = new int[n/2];
            int j = 0;
            for (int i = 1; i < n; i += 2) {
                B[j] = A[i];
                System.out.print(B[j] + " ");
                j += 1;
            }
        }

    }
}
