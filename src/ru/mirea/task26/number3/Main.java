package ru.mirea.task26.number3;

import java.util.LinkedList;
import java.util.List;

class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 10;

    private List<Entry<K, V>>[] buckets;
    private int size;

    public HashTable() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    public void add(K key, V value) {
        int hash = calculateHash(key);
        List<Entry<K, V>> bucket = buckets[hash];
        Entry<K, V> newEntry = new Entry<>(key, value);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                // Если ключ уже существует, заменяем значение
                entry.setValue(value);
                return;
            }
        }

        bucket.add(newEntry);
        size++;

        // Проверяем, нужно ли увеличивать размер таблицы
        if (size > buckets.length * 0.75) {
            resize();
        }
    }

    public V lookup(K key) {
        int hash = calculateHash(key);
        List<Entry<K, V>> bucket = buckets[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null; // Элемент не найден
    }

    public void delete(K key) {
        int hash = calculateHash(key);
        List<Entry<K, V>> bucket = buckets[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    private int calculateHash(K key) {
        return key.hashCode() % buckets.length;
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        List<Entry<K, V>>[] newBuckets = new LinkedList[newCapacity];

        for (int i = 0; i < newCapacity; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        // Перехеширование
        for (List<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                int newHash = entry.getKey().hashCode() % newCapacity;
                newBuckets[newHash].add(entry);
            }
        }

        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashtable = new HashTable<>();

        // Добавление элементов
        hashtable.add("one", 1);
        hashtable.add("two", 2);
        hashtable.add("three", 3);

        // Поиск элемента
        System.out.println("Значение для ключа 'два': " + hashtable.lookup("two"));

        // Удаление элемента
        hashtable.delete("two");

        // Проверка после удаления
        System.out.println("Значение для ключа 'два' после удаления: " + hashtable.lookup("two"));
    }
}


