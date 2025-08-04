import java.util.*;

public class isPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n<=1){
            isPrime = false;  // 0 and 1 are not prime numbers
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){ // Loop till √n for efficiency
                if(n%i==0){
                    isPrime = false;
                    break;  // Exit early if a factor is found
            }
        }

        }
        if(isPrime==true){
            System.out.println(n +" is Prime number.");
        }else{
            System.out.println(n +" is not a Prime number.");
        }
    }
}
