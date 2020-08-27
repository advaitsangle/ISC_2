package ArrayDemo;
import java.util.*;
public class HTMLValidity{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        HTMLValidity obj = new HTMLValidity();
        System.out.println("Paste the code");
        String s = sc.nextLine();
        int len = obj.count(s);
        String[] tags = new String[len];
        int[] pos = new int[len];
        int c = 0;
        for(int i = 0; i<s.length(); i++){
            int j = i;
            String temp = "";
            if(s.charAt(i)=='<'){
                while(s.charAt(j+1)!='>'){
                    j++;
                    temp+=s.charAt(j);
                }
                tags[c] = temp;
                pos[c] = i;
                c++;
            }
            System.out.println(temp);
        }
        
        for(int i = 0; i<len; i++){
            System.out.println(tags[i] + "\t" + pos[i]);
        }
    }
    public boolean validCheck(String[] tags, int[] pos){
        
        return false;
    }
    
    public int count(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='<') count++;
        }
        return count;
    }    
}

