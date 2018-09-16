package ten3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int count=0;
        for(int i=1;i<=a;i++) {
            for (int j = 1; j <= b; j++) {
                for (int z = 1; z <= c; z++) {
                    if (i + j > z && i + z > j && z + j > i) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
