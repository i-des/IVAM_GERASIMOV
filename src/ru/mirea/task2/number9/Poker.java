package ru.mirea.task2.number9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static int[] shuffle(int K[], Random rnd, int n){
        for (int i = 0; i < n; i++){
            int index = rnd.nextInt(i+1);
            int a = K[index];
            K[index] = K[i];
            K[i] = a;
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int q = 52; // Кол-во карт в колоде
        int[] K = new int[q];

        for (int i = 0; i<q; i++){
            K[i] = i;
        }

        K = shuffle(K, rnd, q); // Перемешивание колоды

//        for (int i = 0; i<q; i++){
//            System.out.print(K[i] + " ");
//        }

        Koloda Koloda = new Koloda(K);

        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();
        int[][] Players = new int[n][5];

        int index = 0;
        for (int i = 0; i<n; i++){
            System.out.print("Игрок №" + (i+1) + ": ");
            for (int j = 0; j<5; j++){
                Players[i][j] = K[index];
                index += 1;
                System.out.print(Koloda.getCard(Players[i][j]) + ", ");
            }
            System.out.println();
        }

    }
}
