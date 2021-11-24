import java.util.Scanner;
public class Student {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

         int age;
         boolean male;

         System.out.print("enter your age: ");
         age = sc.nextInt();

         System.out.print("enter true if you are male enter False if you are female: ");
         male = sc.nextBoolean();

         if (age>20 && male == true ){
             System.out.print(" he is a man ");
         }
         else if (age<20 && male == true ){
             System.out.print("he is boy ");
         }
         else if (age<20 && male == false ){
             System.out.print("she is girl");
         }
         else
             System.out.print("she is women");





    }
}
