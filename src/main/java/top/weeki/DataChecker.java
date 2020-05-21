package top.weeki;

import java.util.Arrays;
import java.util.Random;

import top.weeki.sort.BubbleSort;
import top.weeki.sort.SelectionSort;

public class DataChecker {
    public static void main(
        String[] args) {
        check();
    }

    private static boolean check() {
        boolean result = true;
        for (int count = 0; count < 1; count++) {
            int length = 100000;
            int[] arr = randomArray(length);
            ArrayPrinter.print(arr);
//            int[] arr0 = Arrays.copyOf(arr, arr.length);
            int[] arr1 = Arrays.copyOf(arr, arr.length);
//            int[] arr2 = Arrays.copyOf(arr, arr.length);
            int[] arr3 = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arr);
            ArrayPrinter.print(arr);
//            SelectionSort.sort(arr);
//            BubbleSort.sort(arr0);
            BubbleSort.sort1(arr1);
//            BubbleSort.sort2(arr2);
            BubbleSort.sort3(arr3);
            ArrayPrinter.print(arr3);
//            for (int i = 0; i < arr.length; i++) {
//                if (arr0[i] != arr[i]) {
//                    result = false;
//                    break;
//                }
//            }
            for (int i = 0; i < arr.length; i++) {
                if (arr1[i] != arr[i]) {
                    result = false;
                    break;
                }
            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr2[i] != arr[i]) {
//                    result = false;
//                    break;
//                }
//            }
            for (int i = 0; i < arr.length; i++) {
                if (arr3[i] != arr[i]) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println("排序验证" + (result ? "通过" : "失败"));
        return result;
    }

    private static int[] randomArray(
        int length) {
        Random r = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
            arr[i] = r.nextInt(length);
        }
        return arr;
    }

    private static void print(
        int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
