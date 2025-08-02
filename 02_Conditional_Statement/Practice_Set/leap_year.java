 //Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not

 import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println(year + " is leap Year.");
        }
        else if(year%100==0){
            System.out.println(year + " is leap Year.");
        }
        else if(year%400==0){
            System.out.println(year + " is leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
