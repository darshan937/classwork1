import java.util.Scanner;

// WAP to find the maximum between two numbers?

public class Maximum_Num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.print("enter the first number ");
        a = sc.nextInt();
        System.out.print("enter the second number ");
        b = sc.nextInt();
        if (a>b){
            System.out.print("the first number "+ a + " is maximum ");
        }
        else if (a==b){
            System.out.print("the two numbers are equal");
        }
        else{
            System.out.print("the second number"+ b + "is maximum ");
        }




    }
}
