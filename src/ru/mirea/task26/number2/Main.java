package ru.mirea.task26.number2;


public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Добавление элементов в словарь
        hashTable.add("name", "Иван");
        hashTable.add("age", "19");
        hashTable.add("city", "Москва");
        hashTable.add("gender", "Мужской");
        hashTable.add("job", "Программист");
        hashTable.add("country", "Россия");
        hashTable.add("language", "Java");
        hashTable.add("hobby", "Музыка");
        hashTable.add("salary", "0");
        hashTable.add("experience", "3 года");

        // Вывод значений по ключам
        System.out.println("Имя: " + hashTable.get("name"));
        System.out.println("Возраст: " + hashTable.get("age"));
        System.out.println("Город: " + hashTable.get("city"));
        System.out.println("Пол: " + hashTable.get("gender"));
        System.out.println("Работа: " + hashTable.get("job"));
        System.out.println("Страна: " + hashTable.get("country"));
        System.out.println("Язык: " + hashTable.get("language"));
        System.out.println("Хобби: " + hashTable.get("hobby"));
        System.out.println("Зарплата: " + hashTable.get("salary"));
        System.out.println("Опыт: " + hashTable.get("experience"));

        // Удаление элемента по ключу
        hashTable.remove("language");

        // Попытка получения значения удаленного элемента
        System.out.println("Язык после удаления: " + hashTable.get("language"));
    }
}

