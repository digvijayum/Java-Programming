// Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false //otherwise. Also write a program to test yourmethod.

import java.util.*;

public class question2nd {

    public static boolean isEven(int n){
        return (n%2==0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
