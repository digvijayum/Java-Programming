//  Question2: Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe even and odd integers

import java.util.*;

public class question2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }

            System.out.print("Do You want to continue? Press 1 if Yes or 0 if No: ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of even numbers is "+evenSum);
        System.out.println("Sum of odd numbers is "+oddSum);
    }
}
