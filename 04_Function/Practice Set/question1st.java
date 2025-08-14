//  Question 1 : Write a Java method to compute the average of three numbers..
import java.util.*;

public class question1st {

    public static int averageOFthree(int a, int b, int c){
        return ((a + b + c) / 3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers to finds its average : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // function call
        System.out.println("Average of "+ num1 +", "+ num2 +" and "+ num3 +" is "+ averageOFthree(num1, num2, num3));
    }
}
