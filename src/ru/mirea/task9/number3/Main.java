package ru.mirea.task9.number3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Алиса", 3.8));
        students1.add(new Student("Иван", 3.5));
        students1.add(new Student("Лена", 4.0));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Андрей", 3.9));
        students2.add(new Student("Николай", 3.7));
        students2.add(new Student("Фёдор", 3.6));

        List<Student> mergedStudents = mergeSort(students1, students2);

        System.out.println("Объединенный и отсортированный список студентов по GPA:");
        for (Student student : mergedStudents) {
            System.out.println("Имя: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }

    static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() > student2.getGPA()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

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

