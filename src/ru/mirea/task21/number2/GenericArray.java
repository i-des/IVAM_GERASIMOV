package ru.mirea.task21.number2;

import java.util.Arrays;

public class GenericArray<T> {

    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public void setElement(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        // Пример использования
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> integerArray = new GenericArray<>(intArray);

        String[] stringArray = {"apple", "banana", "orange"};
        GenericArray<String> stringArrayWrapper = new GenericArray<>(stringArray);

        Double[] doubleArray = {1.5, 2.5, 3.5};
        GenericArray<Double> doubleArrayWrapper = new GenericArray<>(doubleArray);

        Character[] charArray = {'a', 'b', 'c'};
        GenericArray<Character> charArrayWrapper = new GenericArray<>(charArray);

        System.out.println("Целочисленный массив: " + Arrays.toString(integerArray.getArray()));
        System.out.println("Массив строк: " + Arrays.toString(stringArrayWrapper.getArray()));
        System.out.println("Массив дробных чисел: " + Arrays.toString(doubleArrayWrapper.getArray()));
        System.out.println("Массив символов: " + Arrays.toString(charArrayWrapper.getArray()));
    }
}

