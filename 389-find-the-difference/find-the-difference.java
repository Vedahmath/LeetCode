class Solution {
    public char findTheDifference(String s, String t) {
       
       int count = 0;
       for( char ch : s.toCharArray()) {
        count ^= ch;
       }
       for ( char ch : t.toCharArray()) {
        count ^= ch;
       }
       return (char) count;



    }
}