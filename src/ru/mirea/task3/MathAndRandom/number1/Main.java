package ru.mirea.task3.MathAndRandom.number1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 20; // кол-во элементов массива
        int q = 100; // диапазон сл. чисел от 0 до q
        int[] A = new int[n];
        System.out.println("1)Генерация случайных чисел с помощью класса Random: \nИзначальный массив:");
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(q);
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(A[j + 1] < A[j]) {
                    int swap = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = swap;
                }
            }
        }
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\n2)Генерация случайных чисел с помощью класса Math: \nИзначальный массив:");
        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * q);
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(A[j + 1] < A[j]) {
                    int swap = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = swap;
                }
            }
        }
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
