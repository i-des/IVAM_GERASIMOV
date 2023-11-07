package ru.mirea.listTask1.number2;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public void addNode(String name, int age) {
        Node newNode = new Node(name, age);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void removeNode(int index) {
        Node nodeToDelete = getNodeByIndex(index);
        if (nodeToDelete != null) {
            Node previousNode = nodeToDelete.getPrevious();
            Node nextNode = nodeToDelete.getNext();

            if (previousNode != null) {
                previousNode.setNext(nextNode);
            } else {
                first = nextNode;
            }

            if (nextNode != null) {
                nextNode.setPrevious(previousNode);
            } else {
                last = previousNode;
            }
        }
    }

    public void displayNode(int index) {
        Node node = getNodeByIndex(index);
        if (node != null) {
            System.out.println("Имя: " + node.getName());
            System.out.println("Возраст: " + node.getAge());
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    private Node getNodeByIndex(int index) {
        Node current = first;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }

        return current;
    }
}

