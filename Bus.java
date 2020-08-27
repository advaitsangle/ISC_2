import java.util.*;
public class Bus{
    static double fare = 0; static int current=0, total=0;
    public Bus(double fare, int current){
        this.fare = fare;
        this.current = current;
        this.total = total; 
    }
    public Bus(){
        this.fare = 0;
        this.current = 0;
        this.total = 0; 
    }
    public static void main(){
        Bus b = new Bus();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        String a = "", w; int c=0;
        while(true){
            c++;
            String line = sc.nextLine();
            if(line.equals("")){c--;if(c%4==0)break;}
            else a+=" " + line;
        }       
        Scanner sc2=new Scanner(a);        
        boolean first = true;
        int i = 0;
        while(sc2.hasNext())                          
        {    
            i++;
            if(first){
                first = false;
                b = new Bus(Double.parseDouble(sc2.next()), Integer.parseInt(sc2.next()));
                total=current;
                continue;
            }
            b.stop(Integer.parseInt(sc2.next()),Integer.parseInt(sc2.next()));
            if(i%4==0){
                System.out.println(b.display());
                current=0;total=0;fare=0;first=true;
            }
        }
    }
    public void stop(int on, int off){
        this.total+=on;
        this.current-=off;
        if(this.current<0)current=0;
        this.current+=on;
    }
    public String display(){
        return this.current + "\t" + (this.total*this.fare);
    }
     
}
