package ru.mirea.task29.number4;

import ru.mirea.task29.number3.Item;

import java.util.Set;

public interface Order extends Iterable<Item> {
    boolean addItem(Item item);

    boolean removeItem(String itemName);

    int removeAll(String itemName);

    int getOrderSize();

    Item[] getItems();

    double getOrderCost();

    int getItemQuantity(String itemName);

    Set<String> getItemNames();

    Item[] getSortedItemsByPrice();
}
