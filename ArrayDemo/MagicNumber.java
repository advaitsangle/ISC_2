package ArrayDemo;

import java.util.*;
public class MagicNumber{
    public static void main(){
        Scanner sc  = new Scanner(System.in);
        MagicNumber obj = new MagicNumber();
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
                System.out.println("Enter number to check");
                int a = sc.nextInt();
                System.out.println(obj.magicCheck(a)?"Number is magical": "Number is not magical");
                break;
            case 2:
                System.out.println("Enter limit to print till");
                int n = sc.nextInt();
                for(int i = 1; i<=n; i++)
                    if(obj.magicCheck(i))System.out.println(i);
                break;
            
            case 3:
                System.out.println("Enter lower and upper limit");
                int low = sc.nextInt();
                int high = sc.nextInt();
                for(int i = low; i<=high; i++)
                    if(obj.magicCheck(i))System.out.println(i);
                break;
                
            case 4:
                System.out.println("Enter lower and upper limit");
                int lower = sc.nextInt();
                int higher = sc.nextInt();
                int c = 0;
                System.out.println(obj.count(lower,higher));
                break;
                
            case 5: 
                System.out.println("Upper and Lower limit");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int[] arr = new int[obj.count(a1,b1)];
                int co = 1;
                for(int i =0; i< arr.length;){
                    if(obj.magicCheck(co)){
                        arr[i]=co; 
                        i++;
                    }
                    co++;
                }
                for(int j = 0; j<=arr.length-1; j++)
                    System.out.println(arr[j]);
                break;
            case 6: 
                System.out.println("Upper and Lower limit");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int q = obj.count(a2,b2);
                int ct = 1;
                int height=(int)Math.sqrt(q), width;
                while(q%height!=0)height--;
                width=q/height;
                int[][] doublea = new int[height][width];
                int count = 0;
                for(int i = 0; i<height; i++){
                    for(int j = 0; j<width;){
                        if(obj.magicCheck(ct)){
                        doublea[i][j]=ct; 
                        j++;
                        count++;
                    }
                    ct++;
                    if(count>=q)break;
                    }
                }
                for(int k = 0; k<height; k++){
                    for(int j = 0; j<width; j++){
                        System.out.print(doublea[k][j] + "\t");
                        
                    }
                    System.out.println();
                }
                break;
            case 7:
                int[][] b = new int[3][3];
                for (int i = 0; i<b.length; i++){
                    for(int j = 0; j<b[0].length; j++){
                        b[i][j] = sc.nextInt();
                    }
                    System.out.println();
                }
                for (int i = 0; i<b.length; i++){
                    for(int j = 0; j<b[0].length; j++){
                        if(obj.magicCheck(b[i][j]))System.out.print(b[i][j] + "\t");
                    }
                    System.out.println();
                }
             case 8:
                int[][] d = new int[3][3];
                int l = 0;int i=0, j=0;
                for(int k = 0; k<=9;){
                        if(obj.magicCheck(l)){
                            k++;
                            d[i][j] = l;
                            i++;
                            if(i>2){i=0;j++;}
                            if(j>2)break;
                        }
                        l++; 
                }
                for(int p = 0; p<d.length; p++){
                    for(int r = 0; r<d.length; r++){
                        System.out.print(d[p][r]+ "\t" );
                    }
                    System.out.println();
                }
                break;
            default: break;
        }
    }
    
    public boolean magicCheck(int n){
        int dig = sumOfDigits(n);
        while(dig>9){
            dig = sumOfDigits(dig);
        }
        if(dig==1)return true;
        else return false;
    }
    public int sumOfDigits(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int count(int a, int b){
        int c = 0;
        for(int i = a; i<=b; i++)
            if(magicCheck(i))c++;
        return c;
    }
}