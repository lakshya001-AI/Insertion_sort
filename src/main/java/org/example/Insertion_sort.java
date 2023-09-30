package org.example;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] array = {6, 4, 2, 8, 7, 1};

        Insertionsort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void Insertionsort(int[] array) {
        for (int i = 1; i < array.length ; ++i){
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }

        }
    }
}