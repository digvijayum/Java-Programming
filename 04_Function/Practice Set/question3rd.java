// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
import java.util.*;

public class question3rd {

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome!=0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        
            if(num==reverse){
                return true;
            }else{
                return false;
            }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check it is Palindrome or not! : ");
        int num = sc.nextInt();
        
        if(isPalindrome(num)){
            System.out.println(num+" is Palindrome Number...");
        }else{
            System.out.println(num+" is not a Palindrome Number...");
        }
    }
}
