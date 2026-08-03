class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[i]=(int) Math.pow(nums[i],2);
        }
        Arrays.sort(result);
        return result;
    }
}