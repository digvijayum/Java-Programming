public class binomial_coefficient {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_nmr = factorial(n-r);

        int bincoeff = factorial_n / (factorial_r * factorial_nmr);
        return bincoeff;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println("Binomial Coefficient is "+(binCoeff(5, 2)));
    }
}
