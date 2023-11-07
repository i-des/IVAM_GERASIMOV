package ru.mirea.listTask2.number7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить узел");
            System.out.println("2. Удалить узел");
            System.out.println("3. Отобразить узлы");
            System.out.println("4. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите данные для нового узла: ");
                    int value = scanner.nextInt();
                    list.insertOrderedValue(value);
                    break;
                case 2:
                    System.out.print("Введите данные для узла, который нужно удалить: ");
                    int dataToRemove = scanner.nextInt();
                    list.removeNode(dataToRemove);
                    break;
                case 3:
                    list.displayNodes();
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

