// Write a Java method to compute the sum of the digits in an integer.
//  (Hint : Approach this question in the following way :
//  a. Take a variable sum = 0
//  b. Find the last digit of the number
//  c. Add it to the sum
//  d. Repeat a & b until the number becomes 0 )


import java.util.*;

public class question5th {

    public static void sum(int num){
        int Number = num;
        int sum = 0;
        while ((Number!=0)) {
            int lastdigit = Number % 10;
            sum = sum + lastdigit;
            Number = Number / 10;
        }
        System.out.print("Sum of digits in an integer = "+sum);
    }
    public static void main(String[] args){
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sum(number);
    }
}
