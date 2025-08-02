import java.util.*;
public class else_if {
    public static void main(String[] args){
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18) {
            System.out.println("Adult: Drive, Vote");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    } 
}
