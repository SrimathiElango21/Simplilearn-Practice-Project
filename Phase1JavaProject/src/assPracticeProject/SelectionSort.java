package assPracticeProject;

import java.util.Arrays;

public class SelectionSort {
	
	 void selectionSort(int arr[]) {
		 
		    int size = arr.length;

		    for (int step = 0; step < size - 1; step++) {
		      int min_idx = step;

		      for (int i = step + 1; i < size; i++) {

		        if (arr[i] < arr[min_idx]) {
		          min_idx = i;
		        }
		      }

		      int temp = arr[step];
		      arr[step] = arr[min_idx];
		      arr[min_idx] = temp;
		    }
		  }


	public static void main(String[] args) {
		int[] data = { 20, 12, 10, 15, 2 };
	    SelectionSort ssort = new SelectionSort();
	    ssort.selectionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));

	}

}
