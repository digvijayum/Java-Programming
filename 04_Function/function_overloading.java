public class function_overloading {

    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static float sum(int a, int b, int c){
    //     return a + b + c; 
    // }
    // fun to call int sum 
    public static int sum(int a, int b){
        return a+b;
    }
    // fun to call float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(5,10));
        System.out.println(sum(2.4f , 3.5f));
    }
}
