package leetcode27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length;
        for(int i=0;i<j;){
            if(nums[i]!=val){
                i++;
            }else {
                nums[i]=nums[--j];
            }
        }

//        for(int i=0;i<j;i++){
//            System.out.println(nums[i]);
//        }
//        System.out.println("j: "+j);
        return j;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        Solution sol=new Solution();
        sol.removeElement(nums,val);
    }
}