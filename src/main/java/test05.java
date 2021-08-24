/**
 * 山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，任意两个相邻元素值不相等，数组可能包含多个山峰。找到索引最大的那个山峰元素并返回其索引。
 * 假设 nums[-1] = nums[n] = -∞。
 */
public class test05 {
    public static void main(String[] args) {
        int[] arr={0,1,3,2};
       System.out.println(finmax(arr));

    }
    public  static  int finmax(int[] arr){
        if ( arr == null || arr.length ==0){
            return -1;
        }

        for (int i =arr.length-1;i>=1;i--){
                if (arr[i]>arr[i-1]){
                    return i;
                }
            }
        return  0;

    }
}
