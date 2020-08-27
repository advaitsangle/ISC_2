import java.util.*;
class NumberConvert
{
    String decToBin(int n)
    {
        String bin="";
        int r;
        while(n>0)
        {
            r=n%2;
            bin=r+bin;
            n/=2;
        }
        return bin;
    }

    String decToOct(int n)
    {
        String oct="";
        int r;
        while(n>0)
        {
            r=n%8;
            oct=r+oct;
            n/=8;
        }
        return oct;
    }

    String decToHex(int n)
    {
        String hex="";
        int r;
        while(n>0)
        {
            r=n%16;
            hex=(r<10)?r+hex: (char)(55+ r) + hex;
            n/=16;
        }
        return hex;
    }
    
    int binToDec(int n){
        int ans = 0, c=0;
        while(n>0){
            ans+=(n%10) * Math.pow(2,c);
            n/=10;
            c++;
        }
        return ans;
    }
    
    
    String binToOct(int n){
        String ans = ""; 
        int dig = digits(n), buffer = 0;;
        for(int i = 1; i<= ((dig/3)+1); i++){
            buffer+=(n%10)*1; n/=10; 
            buffer+=(n%10)*2; n/=10;
            buffer+=(n%10)*4; n/=10;
            ans= buffer+ ans;
            buffer=0;
        }
        return ans;
    }
    
    String binToHex(long n){
        String ans = ""; 
        int dig = digits(n), buffer = 0;;
        for(int i = 1; i<= ((dig/4)+1); i++){
            buffer+=(n%10)*1; n/=10; 
            buffer+=(n%10)*2; n/=10;
            buffer+=(n%10)*4; n/=10;
            buffer+=(n%10)*8; n/=10;
            ans=(buffer<10)?buffer+ans: (char)(55+buffer)+ans;
            buffer=0;
        }
        return ans;
    }
    
    int octToDec(int n){
        int ans = 0, c=0;
        while(n>0){
            ans+=(n%10) * Math.pow(8,c);
            n/=10;
            c++;
        }
        
        return ans;
    }
    
    String octToBin(int n){
        String ans = "";
        while(n>0){
            ans= decToBin((n%10)) + ans;
            while(ans.length()%3!=0)ans="0"+ans;
            n/=10;
        }
        return ans;
    }
    
    String octToHex(int n){
        return binToHex(Integer.parseInt(octToBin(n)));
    }

int hexToDec(String s){
    int ans = 0; int c=0;
    for(int i = s.length()-1; i>= 0; i--){
        int val = (Character.isDigit(s.charAt(i)))? (int)s.charAt(i)-(int)'0' : (int)s.charAt(i)-(int)'A'+10;
        ans+= (val * Math.pow(16,c));
        c++;
    }
    return ans;
}

String hexToBin(String s){
    String ans = "";
    for(int i = s.length()-1; i>= 0; i--){
        int val = (Character.isDigit(s.charAt(i)))? (int)s.charAt(i)-(int)'0' : (int)s.charAt(i)-(int)'A'+10;
        ans= decToBin(val) + ans;
        while(ans.length()%4!=0)ans="0"+ans;
    }
    return ans;
}
    
String hexToOct(String n){
    return binToOct(Integer.parseInt(hexToBin(n)));
}

int digits(long n){
    int c= 0;
    while(n>0){
        n/=10;
        c++;
    }
    return c;
}

public static void main(){
    NumberConvert obj = new NumberConvert();
    System.out.println(obj.hexToOct("1E2"));
}
}