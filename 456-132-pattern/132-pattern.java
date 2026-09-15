class Solution {
    public boolean find132pattern(int[] nums) {

        Stack<Integer> s = new Stack<>();

        int second = Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i] < second){
                return true;
            }

            while(!s.isEmpty() && s.peek() < nums[i]){
                second = s.pop();
            }

            s.push(nums[i]);
        }

        return false;
    }
}