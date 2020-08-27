package ArrayDemo;
import java.util.Scanner;
public class AnagramCheck{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings");
        StringBuffer a = new StringBuffer(sc.nextLine().replace(" ", "").toLowerCase());
        StringBuffer b = new StringBuffer(sc.nextLine().replace(" ", "").toLowerCase());

        
        int flag = 0;
        for(int i = 1; i<b.length(); i++){
            if(a.indexOf(b.charAt(i)+"")>=0){b=b.deleteCharAt(i);}
            else{flag=1;break;}
        }
        System.out.println((flag==0)?"Anagram":"Not Anagram");
    }
}