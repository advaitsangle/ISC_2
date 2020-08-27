import java.util.*;
public class MoneyConverter{
    static String ans="Rupees ";
    public static void main(){
        MoneyConverter obj2 = new MoneyConverter();
        String s;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the moneys needed");
        s=sc1.nextLine(); 
        StringTokenizer sc2= new StringTokenizer(s,",.");
        int l = 0;
        int set = sc2.countTokens()-1;
        while(sc2.hasMoreTokens())                          
        {                                      
            while(set>=0){
                int a = Integer.parseInt(sc2.nextToken());
                if(set==0)ans+=" and ";
                ans+=obj2.wordFinder(a,set);
                set--;
            }
            System.out.println(ans + "only");
        }
        ans="";
    }
    public String wordFinder(int a, int set){
        String val="";
        if(a==0)return val;
        int dig=a/100;
        val+= digitsReturner(dig);
        if(digitsReturner(dig)!="")val+= " " + " Hundred";
        val+=tensReturner(a%100)+ " " + placeReturner(set)+ " ";
        return val;
    }
    public static String digitsReturner(int n){
        switch(n){
            case 0: return "";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
    public static String tensReturner(int n){
        String val="";
        if(n>=90){val+=" Ninety "+digitsReturner(n%10);}
        else if(n>=80){val+=" Eighty "+digitsReturner(n%10);}
        else if(n>=70){val+=" Seventy "+digitsReturner(n%10);}
        else if(n>=60){val+=" Sixty "+digitsReturner(n%10);}
        else if(n>=50){val+=" Fifty "+digitsReturner(n%10);}
        else if(n>=40){val+=" Forty "+digitsReturner(n%10);}
        else if(n>=30){val+=" Thirty "+digitsReturner(n%10);}
        else if(n>=20){val+=" Twenty "+digitsReturner(n%10);}
        else if(n>=10){
            switch(n){
                case 10: val+= "Ten"; break;
                case 11: val+= "Eleven"; break;
                case 12: val+= "Twelve";break;
                case 13: val+= "Thirteen";break;
                case 14: val+= "Fourteen";break;
                case 15: val+= "Fifteen";break;
                case 16: val+= "Sixteen";break;
                case 17: val+= "Seventeen";break;
                case 18: val+= "Eighteen";break;
                case 19: val+= "Nineteen";break;
                default: val+= "";
            }
        }
        else if(n>0){val+=" and "+ digitsReturner(n);}
        return val;
    }
    public static String placeReturner(int n){
            switch(n){
                case 0: return "Paisa";
                case 1: return "";
                case 2: return "Thousand";
                case 3: return "Million";
                case 4: return "Billion";
                case 5: return "Trillion";
                case 6: return "Quadrillio";
                case 7: return "Seven";
                case 8: return "Eight";
                case 9: return "Nine";
                default: return "";
            }
    }
}