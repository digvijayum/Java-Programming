import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        sc.close();
    }
}
