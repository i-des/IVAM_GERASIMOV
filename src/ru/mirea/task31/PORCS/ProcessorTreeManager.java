package ru.mirea.task31.PORCS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Processor {
    int key;
    String name;
    double clockSpeed;
    int cacheSize;
    double busSpeed;
    int specInt;
    int specFp;

    public Processor(int key, String name, double clockSpeed, int cacheSize, double busSpeed, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.cacheSize = cacheSize;
        this.busSpeed = busSpeed;
        this.specInt = specInt;
        this.specFp = specFp;
    }
}

class TreeNode {
    Processor data;
    TreeNode left, middle, right;

    public TreeNode(Processor data) {
        this.data = data;
        left = middle = right = null;
    }
}

class ThreeNodeTree {
    private TreeNode root;

    public ThreeNodeTree() {
        root = null;
    }

    public void insert(Processor processor) {
        root = insertRec(root, processor);
    }

    private TreeNode insertRec(TreeNode root, Processor processor) {
        if (root == null) {
            return new TreeNode(processor);
        }

        if (processor.key < root.data.key) {
            root.left = insertRec(root.left, processor);
        } else if (processor.key > root.data.key) {
            root.right = insertRec(root.right, processor);
        } else {
            // Duplicate key, handle accordingly
        }

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        // Implement deletion logic
        return root;
    }

    public void printByLevel() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodeCount = queue.size();

            while (nodeCount > 0) {
                TreeNode current = queue.poll();
                System.out.print(current.data.key + " ");

                if (current.left != null) queue.add(current.left);
                if (current.middle != null) queue.add(current.middle);
                if (current.right != null) queue.add(current.right);

                nodeCount--;
            }

            System.out.println();
        }
    }

    public void saveToFile(String filename) {
        // Implement saving to file logic
    }
}

public class ProcessorTreeManager {
    public static void main(String[] args) {
        ThreeNodeTree processorTree = new ThreeNodeTree();

        // Пример добавления записей
        Processor processor1 = new Processor(1, "Processor1", 3.0, 1024, 2.0, 100, 150);
        Processor processor2 = new Processor(2, "Processor2", 2.5, 512, 1.5, 90, 120);
        Processor processor3 = new Processor(3, "Processor3", 3.2, 2048, 2.5, 120, 180);

        processorTree.insert(processor1);
        processorTree.insert(processor2);
        processorTree.insert(processor3);

        // Пример вывода вершин по уровням
        System.out.println("Вершины дерева по уровням:");
        processorTree.printByLevel();
    }
}
