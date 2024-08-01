package com.revature.assignment;

public class SelectionSort {
    public static void main(String[] args) {
        // Initial array
        int[] array = { 2, 3, 1, 45, 15 };
        
        // Display initial array
        System.out.println("Initial Array:");
        displayArray(array);
        
        // Perform selection sort
        selectionSort(array);
        
        // Display sorted array
        System.out.println("\nSorted Array:");
        displayArray(array);
    }
    
    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                
                // Display array after each iteration for visualization
                System.out.println("After Iteration " + (i + 1) + ":");
                displayArray(array);
            }
        }
    }
    
    // Method to display array elements
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
