class Solution {
    public int arraySign(int[] nums) {
        int countNegativeNums = 0;
        for (int num : nums){
            if(num == 0){
                return 0;
            }
            if(num < 0){
                countNegativeNums++;
            }
        }
        return countNegativeNums % 2 == 0 ? 1 : -1;
        }
    }
