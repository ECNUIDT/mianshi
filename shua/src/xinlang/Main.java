package xinlang;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        int m = s1.length();
        int n = s2.length();
        if(m==0 || n==0){
            System.out.println(0);
            return;
        }
        int[][] dp = new int[m+1][n+1];
        for(int row = 0;row<m+1;row++){
            dp[row][0] = 0;
        }
        for(int column = 0;column < n+1;column++){
            dp[0][column] = 0;
        }
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else if(dp[i][j-1] > dp[i-1][j]){
                    dp[i][j] = dp[i][j-1];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
         System.out.println(dp[m][n]);
    }
}
