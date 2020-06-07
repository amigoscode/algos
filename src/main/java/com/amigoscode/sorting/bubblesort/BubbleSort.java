package com.amigoscode.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {10, 1, 5, 4, 2};

        System.out.println(Arrays.toString(array));

        for (int i = 0, size = array.length; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void print(String o) {
        System.out.println(o);
    }
}
