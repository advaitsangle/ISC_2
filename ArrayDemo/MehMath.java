package ArrayDemo;
public class MehMath{
    
    public static void main(){
        int[] a = {2, 3, 4, 1, 6, 6, 6, 6, 2};
        MehMath obj = new MehMath();
        System.out.println(obj.mean(a));
        obj.sort(a);
        System.out.println(obj.median(a));
        System.out.println(obj.mode(a));
    }
    public double mean(int[] a){
        double sum=0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];
        }
        return sum/(double)a.length;
    }
    public void sort(int[] a){
        int temp;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length - i - 1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public void display(int[] a){
        for(int i = 0; i<a.length; i++)
            System.out.println(a[i]);
    }
    public double median(int[] a){
        int i = a.length;
        if(i%2==0) return (a[i/2] + a[(i/2)-1])/2.0;
        else return a[i/2];
    }
    public int mode(int[] a){
        int freq=1;
        int highfreq = 0, highest=0;
        display(a);
        for(int i = 1; i<a.length; i++){
            if(a[i] == a[i-1]){
                freq++;
            }
            else {
                if(freq >highfreq){
                    highfreq = freq; 
                    highest = a[i];
                }
                freq = 1;
            }
        }
        return highest;
    }
}