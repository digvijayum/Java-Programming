import java.util.Scanner;

public class SimpleArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Declare an array
        int[] numbers;

        // Step 2: Ask user for size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Step 3: Create array
        numbers = new int[size];

        // Step 4: Input values into array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 5: Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}

