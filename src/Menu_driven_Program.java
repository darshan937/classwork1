import java.util.Scanner;

public class Menu_driven_Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Driven Program");
        System.out.println("1: add two numbers ");
        System.out.println("2: calculate the simple interest");
        System.out.println("3: find the number is palindrome or not");
        System.out.println("4: find the number is even or odd");
        System.out.println("enter your choice (1,2,3,4) :");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter the first number :");
                int a = sc.nextInt();
                System.out.println("enter the second number :");
                int b = sc.nextInt();

                int sum = a + b;
                System.out.println(sum + "is addition of two numbers ");
                break;
            case 2:
                System.out.println("enter the principle :");
                int p = sc.nextInt();
                System.out.println("enter the time :");
                int t = sc.nextInt();
                System.out.println("enter the rate");
                float r = sc.nextFloat();

                float si = (p*t*r)/100;
                System.out.println(si + " is the simple interest");
            case 3:
                System.out.println("enter a number with more than 1 digit :");
                int digit = sc.nextInt();
                int rem = digit % 10;
                int qui = digit / 10;
                int rev = rem * 10 + qui;
                if (digit == rev)
                    System.out.println(digit +" is the palindrome number ");
                else
                    System.out.println(digit +" is not the palindrome number ");
                break;

            case 4:
                System.out.println("enter a number: ");
                int num = sc.nextInt();
                int dev = num / 10;
                if (dev==0)
                    System.out.println(num + "is the odd number ");
                else
                    System.out.println(num + "is even number ");








        }

    }
}
