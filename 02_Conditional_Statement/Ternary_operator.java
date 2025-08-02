import java.util.*;
public class Ternary_operator {
    public static void main(String[] args){
        // int number = 7;

        // String type = ((number%2)==0) ? "Even" : "Odd";
        // System.out.println(type);

        // Pass or Fail
        System.out.println("Enter Your Marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String report_card = marks>=35 ? "Pass" : "Fail";
        System.out.println(report_card);

    }
}
