package ru.mirea.listTask2.number7;

public class Node {
    private int[] values;
    private int size;
    private Node next;
    private Node previous;

    public Node() {
        values = new int[5];
        size = 0;
    }

    public int[] getValues() {
        return values;
    }

    public int getSize() {
        return size;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int compareValues(int value) {
        for (int i = 0; i < size; i++) {
            if (values[i] < value) {
                return -1;
            } else if (values[i] > value) {
                return 1;
            }
        }
        return 0;
    }

    public void addValue(int value) {
        if (size < 5) {
            values[size] = value;
            size++;
        }
    }

    public boolean isFull() {
        return size == 5;
    }

    public void transferValues(Node newNode) {
        int newSize = size / 2;
        for (int i = 0; i < newSize; i++) {
            newNode.addValue(values[size - 1]);
            values[size - 1] = 0;
            size--;
        }
    }
}

