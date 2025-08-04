//  Question 5 :
//  What is wrong in the following program?
//  public class Solution {
//      public static void main(String args[]) {
//          for(int i = 0; i <= 5; i++ ) {
//              System.out.println("i = " + i );
//          }
//          System.out.println("i after the loop = " + i );
//      }
//  }
 
import java.util.*;

public class question5th {
    public static void main(String args[]) {
        int i;
        for(i = 0; i <= 5; i++){
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = " + i);
    }
}
