import java.util.*;
public class JavaBasics {
    public static void main(String args[]){
        // System.out.println("Hello World!");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 25;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Digvijay";
        // System.out.println(name);

        // System.err.println("************************************************************");

        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        // System.err.println("***************************************************");
        // String Name = sc.nextLine();
        // System.out.println(Name);/

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a+b);
        // System.out.println("Enter num1: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter num2: ");
        // int num2 = sc.nextInt();
        // System.out.println("Product: ");
        // System.out.println(num1*num2); 
        // System.out.println("Enter radius of circle:");
        // float r = sc.nextFloat();
        // float area = 3.14f*r*r;
        // System.out.println("Area: ");
        // System.out.println(area);

        // Type Conversion
        // int a = 10 ;
        // float b = a;
        // System.out.println(b);
        // float a = 10 ;
        // int b = a;
        // System.out.println(b);

        // // Type Casting
        // Scanner sc = new Scanner(System.in);
        // float number = 99.99f;
        // int Num = (int) number;
        // System.out.println(Num);
        // // int a = sc.nextFloat();
        // // System.out.println(a);

        //Type Promotion in Expression
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(a);
        // System.out.println(a-b); // In java Type Promotion in Expression java automatically promotes each byte,short,or char operand to intwhen evaluating an expression
        // byte bt = 25;
        // bt = (byte)(bt*2);
        // System.out.println(bt);
        // int a = 10;
        // float b = 24.20f;
        // long c = 40;
        // double d = 60;
        // double sum = a+b+c+d;   // If one operand is long , float , or double the whole expression is promoted to long , float , or double respectively.
        // System.out.println(sum);

        //Operators in Java - Arithmetic,Relational,Logical,Bitwise,Assigment

        int a = 10, b = 5;
        System.out.println("Add = "+(a+b));
        System.out.println("Subtract = "+(a-b));
        System.out.println("Divde = "+(a/b));
        System.out.println("Modulo(reminder) = "+(a%b));
        int c = 10;
        int d = ++c;                  // Pre Increment
        System.out.println("c: "+c);
        System.out.println("d: "+d);

        int e = c++;                  // Post Increment  
        System.out.println("c: "+c);
        System.out.println("d: "+e);

        int f = --c;                  // Pre Decrement
        System.out.println("c: "+c);
        System.out.println("f: "+f);

        int g = c--;                  // Post Decrement
        System.out.println("c: "+c);
        System.out.println("g: "+g);

    }
}
