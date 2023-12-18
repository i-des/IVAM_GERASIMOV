package ru.mirea.task29.Milky_Way;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа городов
        System.out.println("Введите кол-во городов");
        int n = scanner.nextInt();

        System.out.println("Введите матрицу");
        // Создание матрицы смежности
        int[][] roads = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }

        // Подсчет количества дорог
        int roadCount = countRoads(roads);
        System.out.println(roadCount);
    }

    // Метод для подсчета количества дорог
    private static int countRoads(int[][] roads) {
        int roadCount = 0;

        // Проходим по каждой ячейке матрицы
        for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j < roads[i].length; j++) {
                // Если есть дорога, увеличиваем счетчик
                roadCount += roads[i][j];
            }
        }

        // Количество дорог посчитано с учетом дублирования, делим пополам
        return roadCount / 2;
    }
}

