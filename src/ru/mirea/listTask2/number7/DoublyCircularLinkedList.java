package ru.mirea.listTask2.number7;

public class DoublyCircularLinkedList {
    private Node first;
    private Node last;

    public DoublyCircularLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertOrderedValue(int value) {
        if (isEmpty()) {
            Node newNode = new Node();
            newNode.addValue(value);
            first = newNode;
            last = newNode;
            newNode.setPrevious(last);
            newNode.setNext(first);
        } else {
            Node current = first;
            while (current != last) {
                if (current.compareValues(value) >= 0) {
                    break;
                }
                current = current.getNext();
            }

            Node newNode = new Node();
            newNode.addValue(value);

            if (current == first) {
                newNode.setNext(first);
                first.setPrevious(newNode);
                first = newNode;
            } else if (current == last && current.compareValues(value) < 0) {
                newNode.setPrevious(last);
                last.setNext(newNode);
                last = newNode;
                newNode.setNext(first);
            } else {
                Node previous = current.getPrevious();
                previous.setNext(newNode);
                newNode.setPrevious(previous);
                newNode.setNext(current);
                current.setPrevious(newNode);
            }
        }

        if (last.isFull()) {
            Node newNode = new Node();
            last.transferValues(newNode);
            newNode.setNext(first);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void removeNode(int value) {
        if (!isEmpty()) {
            Node current = first;
            while (current != last) {
                if (current.compareValues(value) == 0) {
                    if (current == first) {
                        first = first.getNext();
                        last.setNext(first);
                    } else if (current == last) {
                        last = current.getPrevious();
                        last.setNext(first);
                    } else {
                        current.getPrevious().setNext(current.getNext());
                        current.getNext().setPrevious(current.getPrevious());
                    }
                }
                current = current.getNext();
            }
        }
    }

    public void displayNodes() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        Node current = first;
        while (current != last) {
            int[] values = current.getValues();
            System.out.print("[");

            for (int i = 0; i < values.length; i++) {
                if (values[i] != 0) {
                    System.out.print(values[i]);
                    if (i < values.length - 1) {
                        System.out.print(", ");
                    }
                }
            }

            System.out.println("]");
            current = current.getNext();
        }
    }
}

