import java.util.*;
public class palindrome {

    public static void PalindromeNumbers(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //desending order
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending order
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PalindromeNumbers(5);
    }
}
