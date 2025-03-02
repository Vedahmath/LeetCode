class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans= new ArrayList<>(n);
        
        for(int i =1; i <=n ; i++){
            boolean divby3 = i % 3==0;
              boolean divby5 = i % 5==0;
              if(divby3 && divby5){
                ans.add("FizzBuzz");
              }else if(divby3){
                ans.add("Fizz");
              }else if(divby5){
                ans.add("Buzz");
              }else{
                ans.add(String.valueOf(i));
              }
        }
        return ans;
    }
}