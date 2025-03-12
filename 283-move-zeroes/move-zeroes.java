class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return;
        }
        int noZeroIndex =0;


        for (int i =0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[noZeroIndex] = nums[i];
                noZeroIndex++;
            }
        }
        
        while( noZeroIndex < n){
            nums[noZeroIndex] =0;
            noZeroIndex++;
        }
      
        
    }
}