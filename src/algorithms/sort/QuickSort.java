package src.algorithms.sort;

import src.utilpackage.Utils;

public class QuickSort {
	
    public static final int[] data = {4, 8, 6, 1, 10, 3, 7, 9, 2, 5};
    
    public static void main(String[] args) {
        Utils.printArray(data);
        quickSort(data);
        Utils.printArray(data);
    }
    
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    
    public static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if(start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if(part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while(start <= end) {
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

}
