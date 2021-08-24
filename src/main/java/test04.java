/**
 * 回文判断
 */
public class test04 {
    public static void main(String[] args) {
        System.out.println(hw("qaq"));
        System.out.println(hw("abc"));
    }
    public  static  Boolean hw(String s){
        String s1 = new StringBuilder(s).reverse().toString();
        if (s.equals(s1)){
            return true;
        }
        return false;
    }
}
