package ru.mirea.task21.number5;

import java.util.*;

public class Solution<T, V, K> {

    private T variableT;
    private V variableV;
    private K variableK;

    public Solution(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    // Метод для создания и заполнения ArrayList
    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    // Метод для создания и заполнения HashSet
    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    // Метод для создания и заполнения HashMap
    public static <K, V> Map<K, V> newHashMap(Object... keyValuePairs) {
        if (keyValuePairs.length % 2 != 0) {
            throw new IllegalArgumentException("Количество аргументов должно быть четным");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            map.put((K) keyValuePairs[i], (V) keyValuePairs[i + 1]);
        }
        return map;
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> integerList = newArrayList(1, 2, 3, 4, 5);
        System.out.println("ArrayList: " + integerList);

        Set<String> stringSet = newHashSet("one", "two", "three", "four", "five");
        System.out.println("HashSet: " + stringSet);

        Map<String, Integer> stringIntegerMap = newHashMap("key1", 1, "key2", 2, "key3", 3);
        System.out.println("HashMap: " + stringIntegerMap);
    }
}
