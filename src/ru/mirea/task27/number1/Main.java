package ru.mirea.task27.number1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Создание HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("яблоко");
        hashSet.add("банан");
        hashSet.add("апельсин");

        // Преобразование HashSet в TreeSet
        Set<String> treeSet = new TreeSet<>(hashSet);

        // Вывод элементов TreeSet (упорядочены)
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}

