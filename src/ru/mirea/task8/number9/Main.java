package ru.mirea.task8.number9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество нулей: ");
        int a = scanner.nextInt(); // Количество нулей
        System.out.print("Введите количество единиц: ");
        int b = scanner.nextInt(); // Количество единиц

        long[][] dp = new long[a + 1][2];
        dp[1][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= a; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0];
        }

        long result = dp[a][0] + dp[a][1];

        System.out.println(result * (b == 0 ? 1 : result));
    }
}
