public class ArrayExample {
    public static void main(String[]args) {
        int[] num1Array=new int[5];
        int[] numbers ={12,4,5,2,5};
        System.out.println("First Elements: " + numbers[0]);
        System.out.println("Second Elements: " + numbers[1]);
        int arrayLength = numbers.length;
        System.out.println("Array Length: " + arrayLength);
        System.out.println("Using for Loop:");
        int n = 2; // index of the element to be removed
        for (int i = 0; i < numbers.length; i++) {
            if (i == n) ; // Skip the nth element
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
    
    
}
