package SortingDemo;

public class InsertionSortDemo {
	 public static void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 7, 4, 3, 1};
	        insertionSort(arr);

	        System.out.println("Sorted array:");
	        for (int n : arr) System.out.print(n + " ");
	    }
	}


