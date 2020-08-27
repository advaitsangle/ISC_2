import java.util.*;

public class NameBinary{
    public static void main(){
        NameBinary obj = new NameBinary();
        obj.NameToBin();
    }
    void BinToName(){
        Scanner sc = new Scanner(System.in);
        NumberConvert obj = new NumberConvert();
        System.out.println("Enter the code");
        String a = sc.nextLine();
        for(int i = 0; i<a.length(); i+=8){
            int n = Integer.parseInt(a.substring(i,i+8));
            System.out.print((char)obj.binToDec(n));
        }
    }
    void NameToBin(){
        Scanner sc = new Scanner(System.in);
        NumberConvert obj = new NumberConvert();
        System.out.println("Enter a word");
        String a = sc.nextLine();
        for(int i = 0; i<a.length(); i++){
            int n = a.charAt(i);
            System.out.print(obj.decToBin(n)+" ");
        }
    }
}