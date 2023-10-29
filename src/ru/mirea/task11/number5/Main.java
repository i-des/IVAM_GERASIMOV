package ru.mirea.task11.number5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dataSize = 1000; // Размер данных для бенчмарка

        // Создаем ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполняем оба списка случайными данными
        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            int value = random.nextInt(1000);
            arrayList.add(value);
            linkedList.add(value);
        }

        // Замеряем время вставки в начало
        long startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        // Замеряем время удаления
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        long arrayListDeletionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        long linkedListDeletionTime = endTime - startTime;

        // Замеряем время добавления в конец
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        long arrayListAppendTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAppendTime = endTime - startTime;

        // Замеряем время поиска по образцу
        int searchValue = random.nextInt(1000);
        startTime = System.nanoTime();
        arrayList.contains(searchValue);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.contains(searchValue);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;

        // Выводим результаты
        System.out.println("ArrayList Insertion Time: " + arrayListInsertionTime + " nanoseconds");
        System.out.println("LinkedList Insertion Time: " + linkedListInsertionTime + " nanoseconds");
        System.out.println("ArrayList Deletion Time: " + arrayListDeletionTime + " nanoseconds");
        System.out.println("LinkedList Deletion Time: " + linkedListDeletionTime + " nanoseconds");
        System.out.println("ArrayList Append Time: " + arrayListAppendTime + " nanoseconds");
        System.out.println("LinkedList Append Time: " + linkedListAppendTime + " nanoseconds");
        System.out.println("ArrayList Search Time: " + arrayListSearchTime + " nanoseconds");
        System.out.println("LinkedList Search Time: " + linkedListSearchTime + " nanoseconds");
    }
}
