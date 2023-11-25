package ru.mirea.task21.number1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Метод для конвертации массива строк в список
    public static List<String> convertStringArrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // Метод для конвертации массива чисел в список
    public static List<Integer> convertIntArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }

    public static void main(String[] args) {
        // Пример использования
        String[] stringArray = {"apple", "banana", "orange"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Строковый список: " + stringList);

        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertIntArrayToList(intArray);
        System.out.println("Целочисленный список: " + intList);
    }
}

