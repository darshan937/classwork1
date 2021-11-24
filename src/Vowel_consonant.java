import java.util.Scanner;

public class Vowel_consonant {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a character: ");
        char chr = sc.next().toLowerCase().charAt(0);
        switch (chr){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u' :
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");





        }

    }
}
