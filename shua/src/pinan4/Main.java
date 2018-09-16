package pinan4;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        int i=0;
        int j=0;
        int k=0;
        int x=0;
        Scanner input = new Scanner(System.in);
        i=input.nextInt();
        j=input.nextInt();
        k=input.nextInt();
        if(i>j)
        {
            x=i;
            i=j;
            j=x;
        }
        if(i>k)
        {
            x=i;
            i=k;
            k=x;
        }
        if(j>k)
        {
            x=j;
            j=k;
            k=x;
        }
        System.out.println("["+i+", "+j+", "+k+"]");

    }
}
