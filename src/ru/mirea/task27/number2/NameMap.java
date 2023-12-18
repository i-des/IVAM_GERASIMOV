package ru.mirea.task27.number2;

import java.util.HashMap;
import java.util.Map;

public class NameMap {
    public static void main(String[] args) {
        Map<String, String> nameMap = createMap();

        int sameFirstNameCount = getSameFirstNameCount(nameMap);
        int sameLastNameCount = getSameLastNameCount(nameMap);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Иван");
        map.put("Козлов", "Александр");
        map.put("Михайлов", "Сергей");
        map.put("Иванова", "Анна");
        map.put("Петрова", "Мария");
        map.put("Сидорова", "Анна");
        map.put("Козлова", "Екатерина");
        map.put("Михайлова", "Мария");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int value : firstNameCount.values()) {
            if (value > 1) {
                count += value - 1; // учитываем только дополнительные совпадения
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count += value - 1; // учитываем только дополнительные совпадения
            }
        }

        return count;
    }
}

