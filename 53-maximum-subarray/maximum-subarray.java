class Solution {
    public int maxSubArray(int[] nums) {
      int max=Integer.MIN_VALUE;
      int currsum=0;
      for(int i=0;i<nums.length;i++){
        currsum=Math.max(currsum+nums[i],nums[i]);
        max=Math.max(currsum,max);
      }
      return max;
    }
} 