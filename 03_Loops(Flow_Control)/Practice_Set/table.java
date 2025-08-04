//  Question4: Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to want a table of it : ");
        int N = sc.nextInt();
        int table;

        for(int i=1; i<=10; i++){
            table = N * i;
            System.out.println(N +" * "+ i + " = "+table);
        }
    }
}
