public class Reverse_of_given_number {
    public static void main(String[] args){
        int number = 10899;
        int rev = 0;

        while (number>0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number = number / 10;
        }
        System.out.print(rev);
    }
}
