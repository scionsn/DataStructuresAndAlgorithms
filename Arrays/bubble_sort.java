/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ref mycodeschoool
 */
public class bubble_sort {
	static int[] bubble(int arr[]) {
//    	we iterate over array n times to make sure that each element is in its sorted place
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
//    	   the condition in loop is added to avoid iteratiing over already sorted elements bec. in 
//    	   each iteration the biggest elem bubbles up to its sorted position
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
//    	   if array is already sorted before n iterations then its better to break from the loop, to save time
			if (flag == false)
				break;
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 7, 4 };
		for (int i : bubble(arr))
			System.out.println(i);

	}

}

class b extends bubble_sort {

}
