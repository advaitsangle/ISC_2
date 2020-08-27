import java.util.*;
public class StudentReports{
    public static void main(){
        StudentReports obj = new StudentReports();
        String s="";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input");
        s=sc1.nextLine();
        StringTokenizer sc2= new StringTokenizer(s,"~ ");
        System.out.println("HFS\nName\tAge\tGender\tScience\tComputer\t Total");
        
        while(sc2.hasMoreTokens())                          
        {
            int sum=0;
            for(int i = 1; i<=6; i++){
                if(i<4)System.out.print(sc2.nextToken()+"\t");
                else if(i<6){
                    int temp = Integer.parseInt(sc2.nextToken());
                    System.out.print(temp+"\t");
                    sum+=temp;
                }
                else System.out.println("\t"+sum);
            }
        }
    }
}

