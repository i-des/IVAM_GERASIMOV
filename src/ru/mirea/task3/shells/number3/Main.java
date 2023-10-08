package ru.mirea.task3.shells.number3;

public class Main {
    public static void main(String[] args) {
        Double doubleObj = Double.valueOf(Math.PI);

        // Преобразование Double в int
        int intValue = doubleObj.intValue();

        // Преобразование Double в long
        long longValue = doubleObj.longValue();

        // Преобразование Double в float
        float floatValue = doubleObj.floatValue();

        // Преобразование Double в short
        short shortValue = doubleObj.shortValue();

        // Преобразование Double в byte
        byte byteValue = doubleObj.byteValue();

        // Вывод преобразованных значений
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
    }
}
