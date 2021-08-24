/**
 * 斐波那契
 */
public class test02 {
    public static void main(String[] args) {
        System.out.println(fibnache(5));
        System.out.println(fibnache2(5));

    }
    public  static  int fibnache(int n){
        if (n==0||n==1){
            return n;
        }
        if (n>=2){
            return fibnache(n-1)+fibnache(n-2);
        }
        return -1;


    }
    public  static  long fibnache2(int n){
        if (n<0){
            return  -1;
        }
        if (n==0||n==1){
            return  n;
        }else {
            long a=0;
            long b=1;
            long c=0;
            for (int i=0;i<n-1;i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return  c;
        }

    }
}
