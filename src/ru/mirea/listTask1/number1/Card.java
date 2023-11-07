package ru.mirea.listTask1.number1;
import java.util.Scanner;

public class Card {
    private String name;
    private int age;

    public Card(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
