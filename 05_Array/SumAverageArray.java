import java.util.Scanner;

public class SumAverageArray {
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

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / size;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        sc.close();
    }
}
