package aiqiyi;

import java.util.Scanner;

public class Main {
    static int find(int x,int[] arrs){
        int count=0;
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] data1=new int[n];
        int[] data2=new int[n];
//        if(n==1){
//            System.out.println(1);
//            return;
//        }
        int k_1=0;
        int k_2=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<y){
                data1[k_1]=x;
                data2[k_1]=y;
            }else {
                data1[k_1]=y;
                data2[k_1]=x;
            }
            k_1+=1;
        }
        int c=0;
        for(int i=0;i<n;i++) {
            int a=data2[i];
            c+=find(a,data1);
//            System.out.println(c);
        }
        System.out.println(c+1);

    }
}
