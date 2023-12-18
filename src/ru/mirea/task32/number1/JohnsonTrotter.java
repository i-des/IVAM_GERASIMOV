package ru.mirea.task32.number1;

import java.util.Arrays;

public class JohnsonTrotter {

    private static void printPermutation(int[] permutation) {
        for (int num : permutation) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int findLargestMobileElement(int[] permutation, int[] directions) {
        int max = -1;
        int maxIndex = -1;

        for (int i = 0; i < permutation.length; i++) {
            if (directions[i] == 1 && i > 0 && permutation[i] > permutation[i - 1] && permutation[i] > max) {
                max = permutation[i];
                maxIndex = i;
            } else if (directions[i] == -1 && i < permutation.length - 1 && permutation[i] > permutation[i + 1] && permutation[i] > max) {
                max = permutation[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static void swap(int[] permutation, int i, int j) {
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;
    }

    private static void reverseElementsAfter(int[] permutation, int index) {
        int start = index + 1;
        int end = permutation.length - 1;

        while (start < end) {
            swap(permutation, start, end);
            start++;
            end--;
        }
    }

    private static void generatePermutations(int[] permutation) {
        int n = permutation.length;
        int[] directions = new int[n];
        Arrays.fill(directions, -1);

        printPermutation(permutation);

        int mobileElementIndex = findLargestMobileElement(permutation, directions);

        while (mobileElementIndex != -1) {
            int mobileElement = permutation[mobileElementIndex];
            int adjacentIndex = mobileElementIndex + directions[mobileElementIndex];
            int adjacentElement = permutation[adjacentIndex];

            swap(permutation, mobileElementIndex, adjacentIndex);
            swap(directions, mobileElementIndex, adjacentIndex);

            if (adjacentIndex == 0 || adjacentIndex == n - 1 || permutation[adjacentIndex + directions[adjacentIndex]] > mobileElement) {
                reverseElementsAfter(permutation, adjacentIndex);
            }

            printPermutation(permutation);

            mobileElementIndex = findLargestMobileElement(permutation, directions);
        }
    }

    public static void main(String[] args) {
        int[] permutation = {1, 2, 3};

        System.out.println("Генерация перестановок с использованием алгоритма Джонсона-Троттера:");
        generatePermutations(permutation);
    }
}
