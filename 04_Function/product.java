public class product {
    public static int multiply(int a, int b){
        int product = a * b;
        return product; 
    }
    public static void main(String[] args){
        int a = 8;
        int b = 4;
        int mul = multiply(a , b);
        System.out.println("a * b = "+mul); 
    }
}
