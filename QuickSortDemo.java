package SortingDemo;

public class QuickSortDemo {
	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                // Swap
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap pivot
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 80, 30, 90, 40, 50, 70};
	        quickSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");
	        for (int n : arr) System.out.print(n + " ");
	    }

}
