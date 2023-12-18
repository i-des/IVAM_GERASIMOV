package ru.mirea.task26.number2;

public class HashTable {
    private static final int SIZE = 110;  // Размер массива
    private String[] keys;  // Массив ключей
    private String[] values;  // Массив значений

    public HashTable() {
        keys = new String[SIZE];
        values = new String[SIZE];
    }

    // Метод для вычисления хеш-кода
    private int hash(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // Метод добавления элемента
    public void add(String key, String value) {
        int index = hash(key);
        keys[index] = key;
        values[index] = value;
    }

    // Метод получения значения по ключу
    public String get(String key) {
        int index = hash(key);
        return values[index];
    }

    // Метод удаления элемента по ключу
    public void remove(String key) {
        int index = hash(key);
        keys[index] = null;
        values[index] = null;
    }
}
