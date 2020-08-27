import java.util.*;
public class OnOff{
    public static void main(){
        OnOff obj = new OnOff();
        obj.ulta();
    }
    public void ulta(){
        String a = input();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='1')System.out.print("off");
            else System.out.print("on");
        }
    }
    public void controller(){
        StringTokenizer sc2 =  new StringTokenizer(input(),"o");
        while(sc2.hasMoreTokens()){
            String str = sc2.nextToken();
            if(str.charAt(0)=='f')on();
            else off();
        }
    }
    public String input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter string");
        String a = sc1.next();
        return a;
    }
    public void on(){
        System.out.print("0");
    }
    
    public void off(){
        System.out.print("1");
    }
}
