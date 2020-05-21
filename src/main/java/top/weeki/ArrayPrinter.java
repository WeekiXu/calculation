package top.weeki;

public class ArrayPrinter {

    public static void swap(
        int[] arr,
        int i,
        int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(
        int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
