package leetcode88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int loc=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[loc--]=nums2[j--];
            }else{
                nums1[loc--]=nums1[i--];
            }
        }
        while(j>0){
            nums1[loc--]=nums2[j--];
        }

//        for(int k=0;k<nums1.length;k++){
//            System.out.println(nums1[k]);
//        }
    }

    public static void main(String[] args) {
        int[] num1={0};
        int[] num2={1};
        Solution sl=new Solution();
        sl.merge(num1,0,num2,1);
    }
}
