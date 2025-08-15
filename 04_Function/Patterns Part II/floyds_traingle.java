import java.util.*;
public class floyds_traingle {

    public static void Floyds_Traingle(int n){
        int counter = 1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop - how many times will counter printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Floyds_Traingle(5);
    }
}
