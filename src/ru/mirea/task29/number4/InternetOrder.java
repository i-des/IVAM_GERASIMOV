package ru.mirea.task29.number4;

import ru.mirea.task29.number3.Item;

import java.util.Iterator;
import java.util.Set;

public class InternetOrder implements Order {
    // Реализация методов интерфейса Order для InternetOrder

    @Override
    public boolean addItem(Item item) {
        // Реализация добавления элемента в интернет-заказ
        return false;
    }

    @Override
    public boolean removeItem(String itemName) {
        // Реализация удаления элемента из интернет-заказа
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        // Реализация удаления всех элементов с заданным именем из интернет-заказа
        return 0;
    }

    @Override
    public int getOrderSize() {
        return 0;
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }

    @Override
    public double getOrderCost() {
        return 0;
    }

    @Override
    public int getItemQuantity(String itemName) {
        return 0;
    }

    @Override
    public Set<String> getItemNames() {
        return null;
    }

    @Override
    public Item[] getSortedItemsByPrice() {
        return new Item[0];
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    // Другие методы интерфейса Order
}
