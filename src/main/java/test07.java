import java.util.*;


public class test07 {
    /**
     * 最大乘积
     * @param A int整型一维数组 
     * @return long长整型
     * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，
     * 使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)。
     */
    public static  long solve (int[] A) {
        // write code here
        //找到三个正数 或者 2个负数 一个正数
        Arrays.sort(A);
        int length = A.length;
        return Math.max(A[0]*A[1]*A[length-1],A[length-1]*A[length-2]*A[length-3]);

    }

    public static void main(String[] args) {
        int[] arr={4,3,2,0,-9,-8};
        System.out.println(solve(arr));
    }
}
