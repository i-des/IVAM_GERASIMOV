package ru.mirea.task2.number8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        String[] A = new String[n];
        System.out.println("Введите элементы массива поочереди: ");
        for (int i = 0; i<n; i++){
            A[i] = sc.next();
        }
        System.out.print("Изначальный массив: ");
        for (int i = 0; i<n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.print("\nПеревернутый массив: ");
        for (int i = 0; i<n/2; i++){
            String temp = A[i];
            A[i] = A[n-i-1];
            A[n-i-1] = temp;
        }
        for (int i = 0; i<n; i++){
            System.out.print(A[i] + " ");
        }
    }
}
