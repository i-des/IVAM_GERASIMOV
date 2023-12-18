package ru.mirea.task28.number1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        // Создаем HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Яблоко");
        hashSet.add("Банан");
        hashSet.add("Апельсин");
        hashSet.add("Виноград");
        hashSet.add("Арбуз");

        // Преобразовываем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Выводим элементы TreeSet
        System.out.println("Элементы TreeSet: " + treeSet);
    }
}

