package ru.mirea.listTask1.number2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить карточку");
            System.out.println("2. Удалить карточку");
            System.out.println("3. Отобразить карточку");
            System.out.println("4. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.next();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    list.addNode(name, age);
                    break;
                case 2:
                    System.out.print("Введите индекс карточки для удаления: ");
                    int index = scanner.nextInt();
                    list.removeNode(index);
                    break;
                case 3:
                    System.out.print("Введите индекс карточки для отображения: ");
                    int displayIndex = scanner.nextInt();
                    list.displayNode(displayIndex);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}

