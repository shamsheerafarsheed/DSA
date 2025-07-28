package SearchingAlgorithms;

public class LinearSearchDemo {
	public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;  // Found at index
        }
        return -1;  // Not found
    }

    public static void main(String[] args) {
        int[] nums = {11, 25, 39, 42, 53};
        int key = 42;
        int index = linearSearch(nums, key);
        System.out.println(index != -1 ? "Found at index: " + index : "Not found");
    }

}
