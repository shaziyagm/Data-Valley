import java.util.Arrays;
import java.util.Scanner;

public class prog1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to find occurrences: ");
        int numberToFind = scanner.nextInt();
        
        scanner.close();
        
        Arrays.sort(array);
        
        int occurrences = findOccurrences(array, numberToFind);
        
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }
    
    public static int findOccurrences(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }
}
