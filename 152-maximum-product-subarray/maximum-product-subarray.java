class Solution {
    public int maxProduct(int[] nums) {
        int currentmax=nums[0];
        int currentmin=nums[0];
        int maxproduct=nums[0];
        for(int i=1;i<nums.length;i++){
            int currentvalue=nums[i];
            int previousmax=currentmax;
            int previousmin=currentmin;
            currentmax=Math.max(currentvalue,Math.max(previousmax*currentvalue,previousmin*currentvalue));
            currentmin=Math.min(currentvalue,Math.min(previousmin*currentvalue,previousmax*currentvalue));
            maxproduct=Math.max(maxproduct,currentmax);
        }
        return maxproduct;
    }
}