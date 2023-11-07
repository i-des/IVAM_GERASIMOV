package ru.mirea.listTask1.number1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        CardList cardList = new CardList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить карточку");
            System.out.println("2. Удалить карточку");
            System.out.println("3. Отобразить карточку");
            System.out.println("4. Очистить картотеку");
            System.out.println("5. Проверить, пуста ли картотека");
            System.out.println("6. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Card card = new Card("", 0);
                    card.readAttributes();
                    cardList.addCard(card);
                    break;
                case 2:
                    System.out.print("Введите индекс карточки для удаления: ");
                    int index = scanner.nextInt();
                    cardList.removeCard(index);
                    break;
                case 3:
                    System.out.print("Введите индекс карточки для отображения: ");
                    int displayIndex = scanner.nextInt();
                    cardList.displayCard(displayIndex);
                    break;
                case 4:
                    cardList.clear();
                    System.out.println("Картотека очищена.");
                    break;
                case 5:
                    if (cardList.isEmpty()) {
                        System.out.println("Картотека пуста.");
                    } else {
                        System.out.println("В картотеке есть карточки.");
                    }
                    break;
                case 6:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
