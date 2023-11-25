package ru.mirea.task21.number3;

public class GenericArray<T> {

    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
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

        System.out.println("Элемент под индексом 2 в целочисленном массиве: " + integerArray.getElement(2));
        System.out.println("Элемент под индексом 1 в массиве строк: " + stringArrayWrapper.getElement(1));
        System.out.println("Элемент под индексом 0 в масииве дробных чисел: " + doubleArrayWrapper.getElement(0));
        System.out.println("Элемент под индексом 2 в массиве символов: " + charArrayWrapper.getElement(2));
    }
}
