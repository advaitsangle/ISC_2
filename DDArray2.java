import java.util.*;
public class DDArray2
{
    public static void main(){
        DDArray2 obj = new DDArray2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 25 numbers");
        int[][]a = new int[5][5];
        
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                a[i][j] = sc.nextInt();

            }
        }
        
        System.out.println(" 1) Print Prime\n 2) Print Perfect\n 3) Print Palindrome\n 4) Print Harshad\n 5) Print Automorphic\n 6) Exit");
        System.out.println("Enter you choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
                obj.printPrime(a);
                break;
            case 2: 
                obj.printPerfect(a);
                break;
            case 3: 
                obj.printPalindrome(a);
                break;
            case 4: 
                obj.printHarshad(a);
                break;
            case 5: 
                obj.printAutomorphic(a);
                break;
            case 6:
                System.out.println("Exiting..");
                break;
            default: 
                System.out.println("Enter a valid choice");
        }
    }
    
    public void printPrime(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                int num = a[i][j];
                int factors = 0;
                for(int k = 2; k<=num/2; k++)
                    if(num%k==0) factors++;
                if(factors == 0)System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
    
    public void printPerfect(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                int num = a[i][j];
                int factors = 0;
                int sum = 0;
                for(int k = 1; k<num; k++)
                    if(num%k==0) sum+=k;
                if(num==sum)System.out.println(num + "\t");
            }
            System.out.println();
        }
    }
    
    public void printPalindrome(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                String num = ""+  a[i][j];
                String rev="";
                for(int k= num.length()-1; k>=0; k--){
                    rev+=num.charAt(k);
                }
                if(num.equals(rev))System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
    
    public void printHarshad(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                int num = a[i][j];
                int copy = num;
                int sum = 0;
                while(copy > 0){
                    sum+= copy%10;
                    copy/=10;
                }
                if(num%sum==0)System.out.println(num + "\t");
            }
            System.out.println();
        }
    }
    
    public void printAutomorphic(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                int num = a[i][j];
                int sq = num*num;
                String r = "" + num;
                
                if(sq % Math.pow(10,r.length()) == num % Math.pow(10,r.length()))System.out.println(num + "\t");
            }
            System.out.println();
        }
    }
}

