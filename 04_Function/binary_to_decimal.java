import java.util.*;

public class binary_to_decimal {

    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow =0;
        int decNum = 0;

        while(binnum>0){
            int lastDigit = binnum % 10; // last digit of number

            if(lastDigit!=0 && lastDigit!=1){
                System.out.println("Invalid binary number!");
                return;
            }

            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("decimal of "+mynum+" = "+decNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bin = sc.nextInt(); 
        bintodec(bin);
        sc.close();
    }
}
