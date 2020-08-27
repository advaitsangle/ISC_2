import java.util.*;
public class Lamp{
    String name; 
    boolean status;
    public Lamp(String name){
        this.name = name;
    }
    public void turnOn(){
        this.status = true;
    }
    
    public void turnOff(){
        this.status = false;
    }
    public boolean isOn(){
        return this.status;
    }
    public String toString(){
        return this.name + " is " + ((this.status)?" ON":" OFF");
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lamp status");
        String a="";
        while(true){
            String line = sc.nextLine();
            if(line.equals("")){break;}
            a += " " +  line;
        }
        Scanner sc2 = new Scanner(a);
        while(sc2.hasNext()){
            int no = Integer.parseInt(sc2.next());
            Lamp[] arr = new Lamp[no];
            for(int i=0; i<=no-1; i++){
                arr[i] = new Lamp(sc2.next());
            }
            for(int i=0; i<=no-1; i++){
                if(Integer.parseInt(sc2.next())==0)arr[i].turnOff();
                else arr[i].turnOn();
            }
            for(int i=0; i<=no-1;i++){
                System.out.print(" " + arr[i].toString());
            }
            System.out.println();
        }
    }
}


