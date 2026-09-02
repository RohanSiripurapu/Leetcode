class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zerocount=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
        }
        return nums.length-left;
    }
}