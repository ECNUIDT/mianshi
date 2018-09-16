package pinan;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int i)
    {
        boolean isPrime = true;
        for (int j = 2; j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
                isPrime = false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String out = "";
        if(isPrime(n))
        {
            out = out+ n;
        }
        else
        {
            while(n!=1)
            {
                for(int j=2;j<=n;j++)
                {
                    if(j==n)
                    {
                        n=1;
                        out = out + j;
                        break;
                    }
                    if(n%j==0)
                    {
                        n=n/j;
                        out = out + j+"*";
                        break;
                    }
                }
            }
        }
        System.out.println(out);
        in.close();
    }
}