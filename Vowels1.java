import java.util.Scanner;
class Vowels1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");

        char ch = sc.next().toUpperCase().charAt(0);
        String op = 
        (ch=='A'|| ch=='E'| ch=='I' || ch=='O' || ch=='U')? // operand 1 
        (ch+" its a vowel"): // operand 2
        (ch+" it's a consonent"); // operand 3
        

        System.out.println(op);
        

    }
}