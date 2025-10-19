package _5_Recursion;

public class lastcoccur3ence {
    
    // Recursive function to find last occurrence of element in array
    public static int lastOccurrence(int arr[], int index, int target) {
        // Base case: if index < 0, element not found
        if (index < 0) {
            return -1;
        }
        
        // If element is found, return index
        if (arr[index] == target) {
            return index;
        }
        
        // Recursive call for previous index
        return lastOccurrence(arr, index - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 3, 9, 3, 2};
        int target = 3;

        int position = lastOccurrence(arr, arr.length - 1, target);

        if (position != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + position);
        } else {
            System.out.println("Element " + target + " not found in array.");
        }
    }
}
