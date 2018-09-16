package pinan5;


import java.util.Scanner;

public class Main {
    public static int compareVersion(String v1, String v2) {
        if (v1.equals(v2)) {
            return 0;
        }
        String[] version1Array = v1.split("[._]");
        String[] version2Array = v2.split("[._]");
        int index = 0;
        int minLen = Math.min(version1Array.length, version2Array.length);
        long diff = 0;

        while (index < minLen
                && (diff = Long.parseLong(version1Array[index])
                - Long.parseLong(version2Array[index])) == 0) {
            index++;
        }
        if (diff == 0) {
            for (int i = index; i < version1Array.length; i++) {
                if (Long.parseLong(version1Array[i]) > 0) {
                    return 1;
                }
            }

            for (int i = index; i < version2Array.length; i++) {
                if (Long.parseLong(version2Array[i]) > 0) {
                    return -1;
                }
            }
            return 0;
        } else {
            return diff > 0 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] data=new String[n];
        String[] result=new String[n];
        for(int i=0;i<n;i++){
            data[i]=sc.next();
        }
        int k=0;
        String temp;
        for(int i=0;i<n;i++){
            int minindex=i;
            for(int j=i;j<n;j++){
                if(compareVersion(data[minindex],data[j])>0){
                    minindex=j;
                }
            }
            temp=data[i];
            data[i]=data[minindex];
            data[minindex]=temp;
        }

        for(String i:data){
            System.out.println(i);
        }
    }
}
