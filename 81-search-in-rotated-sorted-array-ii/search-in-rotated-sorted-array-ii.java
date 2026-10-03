class Solution {
    public boolean search(int[] nums, int target) {
        boolean found=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return found;
            }
        }
        return false;
    }
}