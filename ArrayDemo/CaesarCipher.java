package ArrayDemo;
public class CaesarCipher{
    static String s = "In the next world war";
    public String encode(int shift){
        String encrypted = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' ')encrypted+=" ";
            else encrypted += (char)((int)s.charAt(i)+shift);
        }
        return encrypted;
    }
    public static void main(){
        CaesarCipher obj = new CaesarCipher();
        System.out.println(obj.encode(1));
    }
}