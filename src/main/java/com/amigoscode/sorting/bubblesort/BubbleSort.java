package com.amigoscode.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {6, 4, 5, 3, 2, 1};
        print(Arrays.toString(array));
        for (int i =0, size = array.length; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        print(Arrays.toString(array));
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
