package ru.mirea.task8.number7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (>1): ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Число должно быть больше 1.");
            return;
        }

        System.out.println("Простые множители числа " + n + " в порядке не убывания с учетом кратности:");
        primeFactorization(n);
    }

    public static void primeFactorization(int n) {
        int divisor = 2;
        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                System.out.println(divisor + " в степени " + count);
            }
            divisor++;
        }
    }
}

