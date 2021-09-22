
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class QuickSort {
	static void quicksort(int arr[], int low, int high) {
//	   if low==high this means we have only one elem in the arr, and when it crosses that means no elem
		if (low >= high)
			return;
		int part_idx = calcPartIdx(arr, low, high);
		quicksort(arr, low, part_idx - 1);
		quicksort(arr, part_idx + 1, high);

	}

	static int calcPartIdx(int arr[], int low, int high) {
//	   we choose pivot as the last element
		int pivot = arr[high];
//	   System.out.println(pivot);
//	   pivot idx indicates that all elements to the left of it are less than the pivot chosen
		int pivtIdx = low;
//		we traverse till high -1 since at high we hve our pivot
		for (int i = low; i < high - 1; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pivtIdx];
				arr[pivtIdx] = temp;
				pivtIdx++;
			}
		}
//	   now after the loop we swap the pivot with the element at the pivot idx, this showcases that the pivot elem
//	   is  atleast sorted as all lesser elem are to the lefgt of it
		int temp = arr[high];
		arr[high] = arr[pivtIdx];
		arr[pivtIdx] = temp;
		return pivtIdx;
	}

	public static void main(String[] args) {
//    	call by reference can be obtained using a single array or collections.
		int arr[] = { 1,9,5,4,5};
		quicksort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
