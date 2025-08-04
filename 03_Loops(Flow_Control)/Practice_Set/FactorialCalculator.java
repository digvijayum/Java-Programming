// Question 3 :Write a program to find the factorialof any number entered by the user.
//  (Hint : factorialofanumbern=n*(n-1)*(n-2)*(n-3)*……*1andexistsforpositivenumbers
//  only. We write factorial as n!
//  So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
//  Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number willing to find Factorial: ");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else{
            long fact = 1;
            for(int i=n; i>=1; i--){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        }
    }    
}
