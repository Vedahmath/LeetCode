class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int[] customer:accounts){
            int curCustWealth=0;
            for(int bank:customer){
                curCustWealth += bank;
            }
            maxWealth=Math.max(maxWealth, curCustWealth);
        }
        return maxWealth;
    }
}