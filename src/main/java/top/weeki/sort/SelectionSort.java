package top.weeki.sort;

import java.time.LocalDateTime;
import java.util.Calendar;

public class SelectionSort {

    public static void main(
        String[] args) {
        int[] arr = { 4, 6, 34, 56, 7, 3, 6, 7 };
        print(arr);
        sort(arr);
        print(arr);
    }

    public static void sort(
        int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(
        int[] arr,
        int i,
        int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(
        int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
