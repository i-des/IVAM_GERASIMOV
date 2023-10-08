package ru.mirea.task3.MathAndRandom.number3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 4;
        int[] A = new int[n];

        boolean f = true;

        for (int i = 0; i < n; i++){
            A[i] = rand.nextInt(10,100);
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < n-1; i++){
            if (A[i] > A[i+1]) {
                f = false;
                break;
            }
//            System.out.print(A[i] + " ");
        }
        if (f) System.out.println("\nЯвляется возрастающей последовательностью");
        else System.out.println("\nНе является возрастающей последовательностью");
    }
}
