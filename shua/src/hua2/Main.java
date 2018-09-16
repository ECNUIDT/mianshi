package hua2;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strs = str.split(" ");

        for(String str_i:strs){
            String result=new StringBuffer(str_i).reverse().toString();
            System.out.print(result+" ");
        }
    }
}