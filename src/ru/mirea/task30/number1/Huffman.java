package ru.mirea.task30.number1;

import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode> {
    int data;
    char c;
    HuffmanNode left, right;

    public int compareTo(HuffmanNode node) {
        return data - node.data;
    }
}

public class Huffman {
    public static void printCodes(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }

        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charFreq = {5, 9, 12, 13, 16, 45};

        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < charArray.length; i++) {
            HuffmanNode node = new HuffmanNode();
            node.c = charArray[i];
            node.data = charFreq[i];
            node.left = null;
            node.right = null;
            priorityQueue.add(node);
        }

        HuffmanNode root = null;

        while (priorityQueue.size() > 1) {
            HuffmanNode x = priorityQueue.poll();
            HuffmanNode y = priorityQueue.poll();

            HuffmanNode sum = new HuffmanNode();
            sum.data = x.data + y.data;
            sum.c = '-';
            sum.left = x;
            sum.right = y;

            root = sum;

            priorityQueue.add(sum);
        }

        printCodes(root, "");
    }
}

