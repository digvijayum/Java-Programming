import java.util.*;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator(+ - * / %) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Addition : "+ (num1+num2));
                break;
            case '-': System.out.println("Subtraction : "+ (num1-num2));
                break;
            case '*': System.out.println("Multiplication : " + (num1*num2));
                break;
            case '/': System.out.println("Division : "+ (num1/num2));
                break;
            case '%': System.out.println("Modulo: "+ (num1%num2));
                break;
            default: System.out.println("Wrong Operator");
                break;
        }
    }
}
