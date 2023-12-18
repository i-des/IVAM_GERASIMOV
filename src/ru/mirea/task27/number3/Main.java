package ru.mirea.task27.number3;

import java.util.LinkedList;

class HashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    static class Entry {
        double key;
        String value;

        public Entry(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hashFunction(double key) {
        double A = (Math.sqrt(5) - 1) / 2; // Константа A (0 < A < 1)
        return (int) Math.floor(TABLE_SIZE * (key * A % 1));
    }

    public void put(double key, String value) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        // Проверяем, есть ли уже элемент с таким ключом
        for (Entry entry : list) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        // Если ключ не найден, добавляем новую запись
        list.add(new Entry(key, value));
    }

    public String get(double key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        // Ищем элемент с заданным ключом
        for (Entry entry : list) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return null; // Ключ не найден
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(3.14, "Pi");
        hashTable.put(2.71, "Euler");

        System.out.println("Значение для ключа 3.14: " + hashTable.get(3.14));
        System.out.println("Значение для ключа 2.71: " + hashTable.get(2.71));
        System.out.println("Значение для ключа 1.618: " + hashTable.get(1.618));
    }
}

