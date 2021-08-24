import javax.xml.soap.SAAJResult;

/**
 * 字符串反转
 */
public class test01 {

    public static void main(String[] args) {
        String s="abs";
//        String reverse = reverse(s);
        String reverse = reverse2(s);
        System.out.println(reverse);


    }
    public static String reverse(String s){
        return  new StringBuilder(s).reverse().toString();
    }
    public  static  String reverse2(String s){
        char[] chars = s.toCharArray();
        String s2="";
        for (int i=chars.length-1;i>=0;i--){
            s2+=chars[i];
        }
        return  s2;
    }
}
