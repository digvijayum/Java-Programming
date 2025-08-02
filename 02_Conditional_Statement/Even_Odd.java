import java.util.*;
public class Even_Odd {
    public static void main(String[] args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println(number+" is Even number");
        }else{
            System.out.println(number+" is Odd number");
        }
    }
}
