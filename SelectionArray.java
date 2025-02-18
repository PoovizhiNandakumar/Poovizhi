public class SelectionArray {
            // Selection Sort Method
            public static void selectionSort(int[] arr) {
                int n = arr.length;
        
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i; // Assume first element is the smallest
        
                    // Find the smallest element in the unsorted part
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }
        
                    // Swap the found smallest element with the first element of the unsorted part
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        
            // Main Method
            public static void main(String[] args) {
                int[] numbers = {64, 25, 12, 22, 11};
        
                System.out.println("Original Array:");
                printArray(numbers);
        
                selectionSort(numbers);
        
                System.out.println("Sorted Array:");
                printArray(numbers);
            }
        
            // Method to Print Array
            public static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        
        


       


    
    

