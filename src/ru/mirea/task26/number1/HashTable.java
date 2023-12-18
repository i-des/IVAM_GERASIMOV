package ru.mirea.task26.number1;

import java.util.LinkedList;

public class HashTable {

    private static final int TABLE_SIZE = 20;  // Размер хеш-таблицы
    private LinkedList<Entry>[] table;         // Массив списков (цепочек) для хранения значений

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Простая хеш-функция, возвращающая остаток от деления хеш-кода на размер таблицы
    private int hashFunction(String key) {
        return key.hashCode() % TABLE_SIZE;
    }

    // Добавление значения в хеш-таблицу
    public void add(String key, String value) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        // Проверка наличия ключа в списке
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Если ключ уже существует, обновляем значение
                return;
            }
        }

        list.add(new Entry(key, value));  // Если ключ не найден, добавляем новую запись
    }

    // Получение значения по ключу
    public String get(String key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        // Поиск ключа в списке
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                return entry.value;  // Если ключ найден, возвращаем значение
            }
        }

        return null;  // Если ключ не найден, возвращаем null
    }

    // Удаление значения по ключу
    public void remove(String key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        // Удаление ключа из списка
        list.removeIf(entry -> entry.key.equals(key));
    }

    // Простой класс для представления записи в хеш-таблице
    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Добавление значений
        hashTable.add("name", "Иван");
        hashTable.add("age", "19");
        hashTable.add("city", "Москва");

        // Получение значений по ключам
        System.out.println("Имя: " + hashTable.get("name"));
        System.out.println("Возраст: " + hashTable.get("age"));
        System.out.println("Город: " + hashTable.get("city"));

        // Удаление значения по ключу
        hashTable.remove("age");
        System.out.println("Возраст после удаления: " + hashTable.get("age"));
    }
}

