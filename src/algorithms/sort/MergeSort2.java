package src.algorithms.sort;

import src.utilpackage.Utils;

public class MergeSort2 {
    
	public static final int[] data = {4, 8, 6, 1, 10, 3, 7, 9, 2, 5};
	public static final int DATA_LENGTH = data.length;
	public static int[] sorted = new int[DATA_LENGTH];
	
	public static void main(String[] args) {
        Utils.printArray(data);
        mergeSort(data);
        Utils.printArray(data);
    }
	
	public static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}
	
	public static void mergeSort(int[] arr, int begin, int end) {
		// 크기가 1보다 큰 경우
		if(begin < end) {
			int mid = (begin + end) / 2;
			mergeSort(arr, begin, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, begin, mid, end);
		}
	}

	public static void merge(int[] arr, int begin, int mid, int end) {
    	int half1 = begin;
    	int half2 = mid + 1;
    	int idx = begin;
    	// 작은 순서대로 배열에 삽입
    	while(half1 <= mid && half2 <= end) {
    		if(arr[half1] <= arr[half2]) {
    			sorted[idx] = arr[half1];
    			half1++;
    		}else {
    			sorted[idx] = arr[half2];
    			half2++;
    		}
    		idx++;
    	}
    	// 남은 데이터도 삽입
    	if(half1 > mid) {
    		for (int i = half2; i <= end; i++) {
				sorted[idx] = arr[i];
				idx++;
			}
    	}else {
    		for (int i = half1; i <= mid; i++) {
				sorted[idx] = arr[i];
				idx++;
			}
    	}
    	// 정렬된 배열을 삽입
    	for (int i = begin; i <= end; i++) {
			arr[i] = sorted[i];
		}
    }
}
