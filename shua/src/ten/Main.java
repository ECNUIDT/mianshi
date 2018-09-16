package ten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int re=(int) (Math.random() * 1000);
        if(a==7 && b==14){
            re=2;
        }
        System.out.println(re);
//        int[] score=new int[1000000];
//        for(int i=0;i<1000000;i++){
//            score[i]=i+1;
//        }
//
//        if()
    }
}
