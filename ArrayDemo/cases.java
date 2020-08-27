package ArrayDemo;

import java.util.*;

public class cases{
    
    public String  toggleCase(String s){
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            ans+= (Character.isUpperCase(s.charAt(i)))? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i)) ;
        }
        return ans;
    }
    
    //public String sentenceCase(String s){
    //    String ans= "" + Character.toUpperCase(s.charAt(0));
    //    ans += s.substring(1, s.length()).toLowerCase();
    //    return ans;
    //}
    
    public String sentenceCase(String s){
       String ans= "" + Character.toUpperCase(s.charAt(0));
       ans += s.substring(1, s.length()).toLowerCase();
       return ans;
    }
    
    public String titleCase(String s){
        String ans= "" + Character.toUpperCase(s.charAt(0));
        for (int i = 0; i<=s.length()-2; i++){
            if(s.charAt(i)!=' ')  ans+=s.charAt(i+1);
            else ans+= Character.toUpperCase(s.charAt(i+1));
        }
        return ans;
    }
    
    public int choiceInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your choice\nEnter 1 for Sentence case.\n2 for lowercase\n3 for UPPERCASE\n4 for Title Case\n5 for tOGGLE cASE\n6 to exit");
        return sc.nextInt();
    }
    public String stringInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        return sc.nextLine();
    }
    public static void main(){
        cases obj = new cases();
        int ch;
        do{
            String ans="";
            ch = obj.choiceInput(); if(ch==6)break;
            String input = obj.stringInput();
            switch(ch){
                case 1: ans = obj.sentenceCase(input); break;
                case 2: ans = input.toLowerCase(); break;
                case 3: ans = input.toUpperCase(); break;
                case 4: ans = obj.titleCase(input); break;
                case 5: ans = obj.toggleCase(input); break;
                default: System.out.println("Enter valid choice");
            }
            System.out.println("OUTPUT STRING\n"+ans+ "\n\n\n\n\n\n");
        }
        while(ch!=6);
    }
}