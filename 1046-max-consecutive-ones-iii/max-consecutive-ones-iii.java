class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int n=nums.length;
        int zerocount=0;
        for(int r=0;r<n;r++){
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
        return n-left;
    }
}