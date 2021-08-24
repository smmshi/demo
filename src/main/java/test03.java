/**
 * 最大公约数
 */
public class test03 {
    public static void main(String[] args) {
        System.out.println(gys(20, 10));
        System.out.println(gys2(20, 10));

    }
    public  static  int gys(int a,int b){
        int min = a<b?a:b;
        for (int i =min;i>=1;i--){
            if (a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }
    public  static  int gys2(int a,int b){
        int min = a<b?a:b;
        int max = a>b?a:b;
        if (max%min==0){
            return min;
        }else {
            for (int i =min/2;i>=1;i--){
                if (a%i==0 && b%i==0){
                    return i;
                }
            }
            return 0;
        }
    }
}
