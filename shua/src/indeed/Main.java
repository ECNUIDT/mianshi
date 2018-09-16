package indeed;

import java.util.Scanner;

public class Main {
    static boolean checkarr(int[] nums){
        int flag=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            nums[i]=x;
        }
//        System.out.println(checkarr(nums));
//        for(int i=0;i<n;i++){
//            System.out.println(nums[i]);
//        }
        if(checkarr(nums)){
            System.out.println(0);
            return;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int tmp1=0-nums[i];
                int tmp2=0-nums[i+1];
                if(tmp1>nums[i+1]){
                    nums[i+1]=tmp2;
                    count++;
                }else{
                    nums[i]=tmp1;
                    count++;
                }
            }

        }
        if(checkarr(nums)){
            System.out.println(count);
        }else {
            System.out.println(-1);
        }

    }
}
