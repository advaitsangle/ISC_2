package ArrayDemo;
import java.util.Scanner;
public class IntersectCheck{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int lower = (a.length()>b.length())?b.length():a.length();
        for(int i=1; i<lower; i++){
            if(b.indexOf(a.charAt(i))>=0){System.out.println(a.charAt(i)+",");b=b.replace(a.charAt(i)+"", "");}
        }
    }
}