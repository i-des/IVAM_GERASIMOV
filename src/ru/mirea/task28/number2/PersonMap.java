package ru.mirea.task28.number2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = createMap();

        int sameFirstNameCount = getSameFirstNameCount(personMap);
        int sameLastNameCount = getSameLastNameCount(personMap);
        System.out.println("Количество людей с одинаковым именем: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковой фамилией: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Doe", "Jane");
        map.put("Johnson", "John");
        map.put("Williams", "Emily");
        map.put("Jones", "Michael");
        map.put("Brown", "Emma");
        map.put("Davis", "Michael");
        map.put("Miller", "Olivia");
        map.put("Wilson", "Sophia");
        map.put("Moore", "Emily");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCountMap = new HashMap<>();

        for (String firstName : map.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int firstNameCount : firstNameCountMap.values()) {
            if (firstNameCount > 1) {
                count += firstNameCount - 1;
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCountMap = new HashMap<>();

        for (String lastName : map.keySet()) {
            lastNameCountMap.put(lastName, lastNameCountMap.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int lastNameCount : lastNameCountMap.values()) {
            if (lastNameCount > 1) {
                count += lastNameCount - 1;
            }
        }

        return count;
    }
}

