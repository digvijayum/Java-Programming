import java.util.*;

public class Break_Statement {
    public static void main(String[] args){
    //     for(int i=1; i<=5; i++){
    //         if(i==3){
    //             break;
    //         }
    //         System.out.println(i);
    //     }
    // System.out.println("I am out of Loop...");

    // Q Keep Entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter You Number: ");
            int num = sc.nextInt();

            if(num%10==0){
                break;
            }
            System.out.println(num);
        }while(true);
    }   
}
