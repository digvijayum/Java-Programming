import java.util.*;

public class While_Loop {
    public static void main(String[] args) {
        // int counter = 0;

        // while(counter<10){
        //     System.out.println("Hello World!");
            
        //     counter++;
        // }
        // System.out.println("Hello World! print 100x");
        //*******************************************************************************************************
        // int counter = 1;
        // while (counter<=10) {
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();
        //********************************************************************************************************
        // Print number from 1 to n
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Range: ");
        // int range = sc.nextInt();
        // int counter = 1;

        // while (counter<=range) {
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();
        //**********************************************************************************************************

        //Print sum of first n natural number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum = sum + i;
            //sum+=i;
            i++;
        }
        System.out.println("Sum of n natural number is : " + sum);
    }
}
