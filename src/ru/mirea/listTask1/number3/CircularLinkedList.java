package ru.mirea.listTask1.number3;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            newNode.setNext(first);
        } else {
            last.setNext(newNode);
            last = newNode;
            newNode.setNext(first);
        }
    }

    public void removeNode(int data) {
        Node current = first;
        Node previous = null;
        while (current != null) {
            if (current.getData() == data) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                    if (current == first) {
                        first = current.getNext();
                    }
                    if (current == last) {
                        last = previous;
                    }
                    return;
                }
            }
            previous = current;
            current = current.getNext();
            if (current == first) {
                break;
            }
        }
    }

    public void displayNodes() {
        Node current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
            if (current == first) {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}

