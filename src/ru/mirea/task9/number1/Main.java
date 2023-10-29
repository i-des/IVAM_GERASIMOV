package ru.mirea.task9.number1;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Алиса"),
                new Student(103, "Иван"),
                new Student(102, "Лена"),
                new Student(105, "Андрей"),
                new Student(104, "Николай")
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName());
        }

        // Сортировка массива студентов по iDNumber методом сортировки вставками
        Arrays.sort(students, Comparator.comparingInt(Student::getIDNumber));

        System.out.println("\nПосле сортировки по ID:");
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName());
        }
    }
}
