class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> val=new HashSet<>();
       for(int i:nums){
        if(val.contains(i)){
            return true;
        }
        val.add(i);
       }
       return false;
    }
}