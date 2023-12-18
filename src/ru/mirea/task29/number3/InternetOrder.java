package ru.mirea.task29.number3;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class InternetOrder implements Iterable<Item> {
    private Node head;
    private int size;

    public InternetOrder() {
        head = new Node(null);
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            add(item);
        }
    }

    public boolean add(Item item) {
        Node newNode = new Node(item);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        size++;
        return true;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node current = head.next;

            @Override
            public boolean hasNext() {
                return current != head;
            }

            @Override
            public Item next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Item item = current.data;
                current = current.next;
                return item;
            }
        };
    }

    private static class Node {
        private Item data;
        private Node next;
        private Node prev;

        public Node(Item data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
    }
}
