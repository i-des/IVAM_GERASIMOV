package ru.mirea.task28.number3;

import java.util.LinkedList;

public class DoubleKeyHashTable<V> {
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry<V>>[] table;

    public DoubleKeyHashTable() {
        this(DEFAULT_CAPACITY);
    }

    public DoubleKeyHashTable(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(double key1, double key2, V value) {
        int hash = hash(key1, key2);
        LinkedList<Entry<V>> bucket = table[hash];

        for (Entry<V> entry : bucket) {
            if (entry.key1 == key1 && entry.key2 == key2) {
                entry.value = value; // Если ключи уже существуют, обновляем значение
                return;
            }
        }

        bucket.add(new Entry<>(key1, key2, value));
    }

    public V get(double key1, double key2) {
        int hash = hash(key1, key2);
        LinkedList<Entry<V>> bucket = table[hash];

        for (Entry<V> entry : bucket) {
            if (entry.key1 == key1 && entry.key2 == key2) {
                return entry.value;
            }
        }

        return null; // Ключи не найдены
    }

    private int hash(double key1, double key2) {
        long bits1 = Double.doubleToLongBits(key1);
        long bits2 = Double.doubleToLongBits(key2);
        long hashBits = bits1 ^ bits2;
        return (int) (hashBits % table.length);
    }

    private static class Entry<V> {
        double key1;
        double key2;
        V value;

        Entry(double key1, double key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DoubleKeyHashTable<String> hashTable = new DoubleKeyHashTable<>();

        // Добавляем значения
        hashTable.put(1.0, 2.5, "Значение1");
        hashTable.put(3.5, 4.2, "Значение2");
        hashTable.put(5.8, 6.1, "Значение3");

        // Получаем значения
        System.out.println(hashTable.get(1.0, 2.5)); // Выводит "Value1"
        System.out.println(hashTable.get(3.5, 4.2)); // Выводит "Value2"
        System.out.println(hashTable.get(5.8, 6.1)); // Выводит "Value3"
    }
}

