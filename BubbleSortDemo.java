package SortingDemo;

public class BubbleSortDemo {
	 public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;

	                    swapped = true;
	                }
	            }

	            if (!swapped)
	            	break; // Optimization
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        bubbleSort(arr);

	        System.out.println("Sorted array:");
	        for (int num : arr) System.out.print(num + " ");
	    }
	}


