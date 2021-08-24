import java.util.Arrays;

/**
 * 数组排序
 */
public class test10 {
    public static void main(String[] args) {
        int[] arr={23,41,12,34};
        for (int i:order2(arr)
             ) {
            System.out.println(i);

        }


    }

    public static int[] order(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] order2(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 1; j <arr.length-1 ; j++) {
                if (arr[i]>arr[j]){
                    int tmp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }

            }
        }
        return  arr;

    }

}
