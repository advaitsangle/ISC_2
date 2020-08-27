import java.util.*;
public class WeekArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int n = sc.nextInt();
        String[] a = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(a[n-1]);
    }
}