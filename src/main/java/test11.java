import java.util.*;

public class test11 {
    /**
     * longest common subsequence
     * @param s1 string字符串 the string
     * @param s2 string字符串 the string
     * @return string字符串
     */
    public static String LCS (String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        String[][]dp=new String[n1+1][n2+1];//表示当处理到s1的第i个元素和s2的第j个元素时公共子序列的长度
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0||j==0) dp[i][j]="";
                else if(s1.charAt(i-1)==s2.charAt(j-1)){//如果相同的话
//                     dp[i][j]=dp[i-1][j-1]+1;
                    dp[i][j]=dp[i-1][j-1]+s1.charAt(i-1);
                }
                else {
//                     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
                }
            }
        }
        if(dp[n1][n2]=="") return "-1";
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        String a="34erfcf12";
        String b="34ttttt45";
        System.out.println(LCS(a, b));
    }
}
