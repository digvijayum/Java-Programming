public class Reverse_of_number{
    public static void main(String[] args){
        int number = 10889;
        while (number>0) {
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10; //number/=10;
        }
        System.out.println();
    }
}