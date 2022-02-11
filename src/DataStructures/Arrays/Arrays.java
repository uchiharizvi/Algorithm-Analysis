package DataStructures.Arrays;

import DataStructures.Utility.RandomIntGenerator;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Size : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = RandomIntGenerator.generateInteger(1, n);
        }
        arr = sort_insertion(arr);
        java.util.Arrays.stream(arr).sequential().forEach(System.out::println);
    }

    public static void insert() {
    }

    ;

    public static void search() {
    }

    ;

    public static void read() {
    }

    ;

    public static void delete() {
    }

    ;

    /**
     * Algorithm : Selection Sort
     * O(N²) - Quad Time
     * Better Approach than Bubble Sort
     **/
    public static int[] sort_selection(int[] arr) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                steps++;
                if (arr[j] < arr[lowest]) {
                    steps++;
                    lowest = j;
                }
            }
            if (lowest != i) {
                steps++;
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }
        }
        System.out.println("N : " + arr.length);
        System.out.println("Steps: " + steps);
        return arr;
    }

    /**
     * Algorithm : Bubble Sort
     * O(N²) - Quad Time
     **/
    public static int[] sort_bubble(int[] arr) {
        int steps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                steps++;
                //compare
                if (arr[j] > arr[j + 1]) {
                    steps++;
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Algorithm
        System.out.println("N : " + arr.length);
        System.out.println("Steps: " + steps);
        return arr;
    }

    /**
     * Algorithm : Insertion Sort
     **/
    public static int[] sort_insertion(int[] arr) {
        int pos = 0;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            temp = arr[i];
            while (pos > 0 && arr[pos - 1] > temp) {
                arr[pos] = arr[pos - 1];
                pos = pos - 1;
                arr[pos] = temp;
            }
        }
        return arr;
    }

    /**
     * Algorithm : Quick Sort
     **/
    public static int[] sort_quick(int[] arr) {
        int left = 0, right = arr.length - 1;
        quickSort(arr, left, right);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {

        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left - 1);
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
    }
}
