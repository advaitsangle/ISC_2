import java.util.*;
public class ArrayReplace{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50, 0, 0, 0, 0, 0};
        System.out.println("Enter a value");
        int num = sc.nextInt();
        int temp=0;
        if(num<a[0]){
            for(int i = 0; i<i-1; i++)
                temp=a[i+1];
                a[i+1]=a[i];
                
        }
    }
}