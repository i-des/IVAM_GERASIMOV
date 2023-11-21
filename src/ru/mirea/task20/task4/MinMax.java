package ru.mirea.task20.task4;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T findMax() {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static class Calculator {
        public static <T extends Number> double sum(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number> double multiply(T a, T b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number> double divide(T a, T b) {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("Нельзя делить на 0");
            }
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number> double subtraction(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Минимум: " + intMinMax.findMin());
        System.out.println("Максимум: " + intMinMax.findMax());

        Double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 0.01};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Минимум: " + doubleMinMax.findMin());
        System.out.println("Максимум: " + doubleMinMax.findMax());

        System.out.println("Сумма чисел " + 5 +  " и " + 3.14 + " = " + Calculator.sum(5, 3.14));
        System.out.println("Произведение чисел " + 2.5 +  " и " + 4 + " = " + Calculator.multiply(2.5, 4));
        System.out.println("Частное чисел " + 10 +  " и " + 2 + " = " + Calculator.divide(10, 2));
        System.out.println("Разность чисел " + 7 +  " и " + 3 + " = " + Calculator.subtraction(7, 3));
    }
}

