package ru.mirea.listTask1.number1;

import java.util.ArrayList;

public class CardList {
    private ArrayList<Card> cards;

    public CardList() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Неверный индекс для удаления.");
        }
    }

    public void displayCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.get(index).displayAttributes();
        } else {
            System.out.println("Неверный индекс для отображения.");
        }
    }

    public void clear() {
        cards.clear();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
