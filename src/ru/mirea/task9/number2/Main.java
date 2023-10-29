package ru.mirea.task9.number2;

import java.util.Comparator;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию GPA
        if (student1.getGPA() > student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() < student2.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Алиса", 3.8),
                new Student("Иван", 3.5),
                new Student("Лена", 4.0),
                new Student("Андрей", 3.9),
                new Student("Николай", 3.7)
        };

        System.out.println("До сортировки по GPA:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }

        // Сортировка студентов по GPA в порядке убывания
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        java.util.Arrays.sort(students, comparator);

        System.out.println("\nПосле сортировки по GPA (убывающая последовательность):");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

