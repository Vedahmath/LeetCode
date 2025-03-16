class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean isIncreasing = true, isDecreasing = true;
       if(nums.length == 1){
        return true;
       }
       for(int i=1; i<nums.length; i++){
        if(nums[i] < nums[i-1]){
            isIncreasing = false;
        }
        if(nums[i] > nums[i-1]){
            isDecreasing = false;
        }
       }
       return isIncreasing || isDecreasing;
    }
}