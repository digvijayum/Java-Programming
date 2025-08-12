public class isPrime {
    public static boolean IsPrime(int n){
        boolean isPrime = true;
        // for(int i=2; i<=(n-1); i++){
        //     if(n%i==0){
        //     return false;
        //     }
        // }

        // Optimized loop
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(IsPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        // System.out.println(IsPrime(6));
        PrimeInRange(1000);
    }
}
