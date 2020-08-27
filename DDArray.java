        import java.util.*;
public class DDArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a[][] = {{10,20,30,35},
                     {40,50,60,65},
                     {70,80,90,95}};
        int r,c;
        for(r=0; r< a.length; r++){                     //a.length -> rows
            for(c=0; c<a[r].length; c++){               //a[r].length -> columns
               a[r][c] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("original Array is");
        for(r=0; r< a.length; r++){                     //a.length -> rows
            for(c=0; c<a[r].length; c++){               //a[r].length -> columns
                System.out.print(a[r][c]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    
        System.out.println("Reverse Array is ");
        for(r=a.length-1; r>=0; r--){
                for(c=a[r].length-1; c>=0; c--){
                    System.out.print(a[r][c]+"\t");
                }
                System.out.println();
            }
        System.out.println();
    }
}