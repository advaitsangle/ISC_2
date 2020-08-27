package ArrayDemo;
import java.util.Scanner;
public class PalindromeCheck{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String n = sc.nextLine();
        StringBuffer a = new StringBuffer(n);
        if(a.toString().equalsIgnoreCase(a.reverse().toString())){System.out.println("Palindrome");}
        else System.out.println("Not palindrome");
    }
}