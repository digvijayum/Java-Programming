import java.util.*;

public class table_reverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Nummber to willing to print table in Reverse order: ");
        int N = sc.nextInt();

        for(int i = 10; i>=1; i--){
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
