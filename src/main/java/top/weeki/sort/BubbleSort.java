package top.weeki.sort;

import java.util.Calendar;

import top.weeki.ArrayPrinter;

public class BubbleSort {
    public static void main(
        String[] args) {
        int[] arr = { 27, 2, 49, 48, 49, 37, 9, 3, 43, 26, 2, 42, 26, 42, 42, 3,
            15, 45, 42, 31, 29, 44, 24, 3, 22, 39, 28, 25, 4, 12, 29, 0, 3, 32,
            49, 24, 8, 42, 20, 46, 11, 7, 14, 24, 19, 40, 18, 35, 45, 6 };
        ArrayPrinter.print(arr);
        sort3(arr);
        ArrayPrinter.print(arr);
    }

    public static void sort(
        int[] arr) {
        long start = Calendar.getInstance().getTimeInMillis();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayPrinter.swap(arr, j, j + 1);
                }
            }
        }
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("BubbleSort sort use " + (end - start) + "ms");
    }

    /**
     * 最优，10w 17287ms
     * 
     * @param arr
     */
    public static void sort1(
        int[] arr) {
        long start = Calendar.getInstance().getTimeInMillis();
        for (int i = arr.length - 1; i > 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayPrinter.swap(arr, j, j + 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("BubbleSort sort1 use " + (end - start) + "ms");
    }

    public static void sort2(
        int[] arr) {
        long start = Calendar.getInstance().getTimeInMillis();
        int maxSwapLoc = arr.length - 1;
        for (int i = arr.length - 1; i > 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayPrinter.swap(arr, j, j + 1);
                    swap = true;
                    maxSwapLoc = j + 1;
                }
            }
            if (!swap) {
                break;
            }
            i = maxSwapLoc;
        }
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("BubbleSort sort2 use " + (end - start) + "ms");
    }

    /**
     * 最优，10w 17287ms
     * 
     * @param arr
     */
    public static void sort3(
        int[] arr) {
        long start = Calendar.getInstance().getTimeInMillis();
        for (int i = arr.length - 1; i > 0; i--) {
            boolean swap = false;
            int maxLoc = 0;
            for (int j = 0; j < i-1; j++) {
                if (arr[j + 1] >= arr[maxLoc]) {
                    maxLoc = j + 1;
                }
            }
            if(maxLoc<i){
                swap = true;
            }
            if (arr[maxLoc] > arr[i]) {
                ArrayPrinter.swap(arr, maxLoc, i);
//                System.out.println("第" + i + "趟");
//                ArrayPrinter.print(arr);
            }
            if (!swap) {
                break;
            }
        }
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("BubbleSort sort3 use " + (end - start) + "ms");
    }

    private static boolean findMax(
        int[] arr,
        int i) {
        boolean swap = false;
        int maxLoc = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
                maxLoc = j + 1;
                swap = true;
            }
        }
        ArrayPrinter.swap(arr, maxLoc, i);
        return swap;
    }

}
