import java.util.*;
public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of pencil: ");
        float price1 = sc.nextFloat();
        System.out.println("Enter price of pen: "); 
        float price2 = sc.nextFloat();
        System.out.println("Enter price of eraser: ");
        float price3 = sc.nextFloat();
        float cost = price1+price2+price3;
        System.out.println("Total cost: "+cost);

        // Add with 18% gst tax
        float new_cost = cost + (0.18f * cost);
        System.out.println("New cost with 18% GSt Tax is: "+new_cost);
    }
    
}
