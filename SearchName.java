package SearchingAlgorithms;

public class SearchName {
	 public static int linearSearch(String[] arr, String key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].equalsIgnoreCase(key))  // Case-insensitive match
	                return i;
	        }
	        return -1;  // Not found
	    }

	    public static void main(String[] args) {
	        String[] names = {"Arun", "Meena", "Rahul", "Priya", "Amit"};
	        String key = "Rahul";
	        int index = linearSearch(names, key);

	        System.out.println(index != -1 ? "Found at index: " + index : "Name not found");
	    }
	}

