import java.util.*;
public class invert_pyramid {

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_rotated_half_pyramid(10);
    }    
}
