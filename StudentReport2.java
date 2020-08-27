import java.util.*;
public class StudentReport2{
    public static void main(){
        String s="";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input");
        s=sc1.nextLine();
        StringTokenizer sc2= new StringTokenizer(s,"~");
        System.out.println("\t\t\tHFS\nName\tAge\tGender\tScience\tComputer\t Total");
        
        while(sc2.hasMoreTokens())                          
        {
            StringTokenizer sc3= new StringTokenizer(sc2.nextToken()," ");
            int l=0, sum=0;;
            while(sc3.hasMoreTokens()){
                l++;
                if(l==3)System.out.print((sc3.nextToken().equals("M"))?"Male":"Female" + "\t");
                else if(l<4)System.out.print(sc3.nextToken()+"\t");
                else if(l<6){
                    int temp = Integer.parseInt(sc3.nextToken());
                    System.out.print(temp+"\t");
                    sum+=temp;
                }
            }
            System.out.println("\t"+sum);
        }
    }
}

