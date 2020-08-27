import java.util.*;
public class Patterns
{
    public static void main(){
        Patterns obj = new Patterns();
        obj.controller();
    }
    public void controller(){;
        StringTokenizer sc2 =  new StringTokenizer(input(),"-");
        while(sc2.hasMoreTokens()){
            String str = sc2.nextToken();
            if(str.charAt(0)<str.charAt(1))ascending(str);
            else descending(str);
            System.out.println("-------------------------------------");
        }
    }
    public String input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter string");
        String a = sc1.next();
        return a;
    }
    public void ascending(String str){
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    
    public void descending(String str){
        for(int i=3; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
