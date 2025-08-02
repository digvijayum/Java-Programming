public class Largest_of_three {
    public static void main(String[] args) {
        int A = 1, B = 3, C=6;
        if (A>=B && A>=C) {
            System.out.println("A is Largest of B and C");
        }
        else if(B>=C){
            System.out.println("B is Largest og A and C");
        }
        else{
            System.out.println("C is Largest of A and B");
        }
    }
    
}
