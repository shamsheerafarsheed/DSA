package SearchingAlgorithms;
//work only in sorted array/list
public class BinarySearchDemo {
	public static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) 
        	return -1;

        int mid = (start + end) / 2;
        if (arr[mid] == key)
        	return mid;
        else if (key < arr[mid]) 
        	return binarySearch(arr, key, start, mid - 1);
        else return binarySearch(arr, key, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = {5, 15, 25, 35, 45};
        int key = 35;
        int index = binarySearch(nums, key, 0, nums.length - 1);
        System.out.println(index != -1 ? "Found at index: " + index : "Not found");
    }

}
