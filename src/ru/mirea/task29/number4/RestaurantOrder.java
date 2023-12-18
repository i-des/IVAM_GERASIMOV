package ru.mirea.task29.number4;

import java.util.Iterator;
import java.util.Set;
import ru.mirea.task29.number3.Item;

public class RestaurantOrder implements Order {
    // Реализация методов интерфейса Order для RestaurantOrder

    @Override
    public boolean addItem(Item item) {
        // Реализация добавления элемента в заказ ресторана
        return false;
    }

    @Override
    public boolean removeItem(String itemName) {
        // Реализация удаления элемента из заказа ресторана
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        // Реализация удаления всех элементов с заданным именем из заказа ресторана
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

