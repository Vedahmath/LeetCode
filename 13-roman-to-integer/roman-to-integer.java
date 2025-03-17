class Solution {
     public int valueOf(char val) {
        if (val == 'I') return 1;
        if (val == 'V') return 5;
        if (val == 'X') return 10;
        if (val == 'L') return 50;
        if (val == 'C') return 100;
        if (val == 'D') return 500;
        if (val == 'M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
         int sum=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=valueOf(s.charAt(i));
            if(cur>=prev){
                sum+=cur;
            }
            else{
                sum-=cur;
            }
            prev=cur;
        }
        return sum;
    }
        
    }
