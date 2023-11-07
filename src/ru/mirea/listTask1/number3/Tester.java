package ru.mirea.listTask1.number3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
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
                    System.out.print("Введите данные для новой карточки: ");
                    int data = scanner.nextInt();
                    list.addNode(data);
                    break;
                case 2:
                    System.out.print("Введите данные для новой карточки, которую нужно удалить: ");
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

