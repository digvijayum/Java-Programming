import java.util.*;

public class Continue_Statement {
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        
        // }
        //Q Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Your Number: ");
            int num = sc.nextInt();

            if(num%10==0){
                continue;
            }

            System.out.println(num);
        }while(true);
    }
}
