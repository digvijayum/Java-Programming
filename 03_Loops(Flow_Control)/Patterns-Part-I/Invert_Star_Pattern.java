public class Invert_Star_Pattern {
    public static void main(String[] args){
        int n = 100;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=(n-line+1); star++){  //for invert string we use star=(n-line+1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
