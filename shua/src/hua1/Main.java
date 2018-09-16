package hua1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char[] chs=str.toCharArray();
        int[] books=new int[256];
        for(int i=0;i<256;i++){
            books[i]=0;
        }
        for(char ch:chs){
//            System.out.println(ch);
            books[ch]++;
        }
        int j=chs.length-1;
        for(;j>=0;j--){
            if(books[chs[j]]==1){
                System.out.println(chs[j]);
                break;
            }
        }
        if(j<0){
            System.out.println("NULL");
        }
    }
}
