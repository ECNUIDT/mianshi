package leetcode26;

import javax.sound.midi.Soundbank;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int curr=nums[0];
        int loc=1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=curr){
                nums[loc++]=nums[i];
                curr=nums[i];
            }
        }

        return loc;
    }

    public static void main(String[] args) {
        int[] nums={1,1};
        Solution sol=new Solution();
        int loc=sol.removeDuplicates(nums);
        for(int k=0;k<loc;k++){
            System.out.println(nums[k]);
        }
        System.out.println("length: "+loc);
    }
}
