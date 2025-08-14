import java.util.*;

public class decimal_to_binary {

    public static void dectobin(int n){
        int mynum = n;
        int pow = 0;
        int binnum = 0;

        while(n>0){
            int rem = n % 2;// remainder (binary digit)
            binnum = binnum + rem * ((int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + mynum + " = " + binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: "); 
        int num = sc.nextInt();
        dectobin(num);
    }
}
