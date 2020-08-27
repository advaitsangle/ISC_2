public class BitwiseOp{
    public static void main(){
        int a = 5,b=3;
        int c = a&b;
        System.out.println(c);
        int d = a|b;
        System.out.println(d);
        int e = ~a;
        System.out.println(e);
        System.out.println(a<<1);
        System.out.println(a>>1);
        System.out.println(a<<2);
        System.out.println(a>>2);
    }
}