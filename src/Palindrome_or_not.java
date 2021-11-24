import java.util.Scanner;

public class Palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a two digit number :" );
        int a = sc.nextInt();

        int b = a % 10;
        int c = a / 10;
        int d = b * 10 + c;

        if (d == a)
            System.out.print(a + " is a palindrome");

        else
            System.out.print(a + " is not a palaindrome");


    }
}
