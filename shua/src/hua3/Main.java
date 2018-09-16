package hua3;

import java.util.Scanner;
public class Main{
    public static String Bigmul(String A, String B){
        char char_1[] = A.toCharArray();
        char char_2[] = B.toCharArray();
        int startA=0;
        int startB=0;
        if(char_1[0]=='-'){
            startA=1;
        }
        if(char_2[0]=='-'){
            startB=1;
        }
        int result[] = new int[char_1.length + char_2.length];
        int num_1[] = new int[char_1.length];
        int num_2[] = new int[char_2.length];
        int n1_i=0;
        int n2_i=0;
        for(int i = startA; i < char_1.length;i++)
            num_1[n1_i++] = char_1[i]-'0';
        for(int i = startB; i < char_2.length;i++)
            num_2[n2_i++] = char_2[i]-'0';

        for(int i =0 ; i < char_1.length; i++){
            for(int j =0; j < char_2.length; j++){
                result[i+j]+=num_1[i]*num_2[j];
            }
        }
        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }
        String resultStr = "";
        for(int i = 0; i < result.length-1; i++){
            resultStr+=""+result[i];
        }
        int flag=startA+startB;
        if(flag==1){
            resultStr='-'+resultStr;
        }
        return resultStr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String result = Bigmul(str1, str2);
        System.out.println(result);

    }
}