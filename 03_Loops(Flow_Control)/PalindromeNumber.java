import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0, original = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (original == rev)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
    }
}
