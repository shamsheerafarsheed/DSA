package SortingDemo;

import java.util.Arrays;

public class BuiltinSort {
	public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        Arrays.sort(arr);

        System.out.println("Sorted using Arrays.sort():");
        for (int n : arr) System.out.print(n + " ");
    }
}



