package ArrayDemo;
import java.util.*;


public class HW1{
    int n;
    public static void main(){
        HW1 obj = new HW1();
        obj.input();
        obj.fillArray();
    }
    
    public boolean PalindromeCheck(int n){
        int rev = 0;
        int copy = n;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return (copy == rev)? true: false;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
    }
    public void fillArray(){
        int[] a = new int[n];
        int c = 0;
        for (int i = 0; i<n; ){
            if(PalindromeCheck(c)){
                a[i]=c;
                i++;
            }
            c++;
        }
        display(a);
    }
    public void display(int[] a){
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }            
}