import java.util.*;

public class income_tax {
    public static void main(String[] args){
        System.out.println("Enter Your Income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;

        if(income<500000){
            tax = 0;
            System.out.println("Your Tax is "+ tax);
        }
        else if(income>500000 && income<=1000000){
            tax = (int)(income*(0.2));
            System.out.println("Your Tax is "+ tax);
        }
        else{
            tax = (int)(income*(0.3));
            System.out.println("Your Tax is "+ tax);
        }
    }
}
