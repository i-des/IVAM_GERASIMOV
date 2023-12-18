package ru.mirea.task26.number4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Создание очереди с приоритетом
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Добавление элементов
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(9);
        priorityQueue.add(10);

        // Извлечение и вывод на экран нескольких элементов
        int numberOfElementsToExtract = 3;
        for (int i = 0; i < numberOfElementsToExtract; i++) {
            int element = priorityQueue.poll(); // poll() извлекает и возвращает элемент с наивысшим приоритетом
            System.out.println("Извлеченный элемент: " + element);
        }
    }
}

