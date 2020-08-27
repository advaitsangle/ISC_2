import java.util.*;
public class DDArray1{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[3][3];
        int product[] = {1,1,1};
        int r,c, sum=0;
        for(r=0; r< a.length; r++){                     //a.length -> rows
            for(c=0; c<a[r].length; c++){               //a[r].length -> columns
               a[r][c] = sc.nextInt();
               sum+=a[r][c];
               product[c]*=a[r][c];
            }
            System.out.println("ROW "+ (r+1));
            System.out.println("Sum: " + sum);
            sum=0;
        }
        for(int i = 0; i<a.length; i++){
            System.out.println("ROW "+ (i+1));
            System.out.println("Product: " + product[i]);
        }
    }
}
