package pinan2;

import java.util.Scanner;
public class Main {
    public static int compare(long num1,long num2){
        String str1 = num1 + "";
        String str2 = num2 + "";
        int temp1 = Integer.parseInt(str1+str2);
        int temp2 = Integer.parseInt(str2+str1);

        return temp2 - temp1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(); //输入n个整数
        long []a=new long[n];
        long temp=0;

        for(int j=0;j<n;j++)
            a[j]=sc.nextLong();

        for(int x=0;x<n;x++)
            for(int y=x+1;y<n;y++)
            {
                if(compare(a[x],a[y])<0)//判断条件是两个数拼接的两种情况的差
                {
                    temp=a[x];
                    a[x]=a[y];
                    a[y]=temp;
                }
            }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
}