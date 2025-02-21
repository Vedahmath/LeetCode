import java.util.*;
//veda
class Solution {
    public static int sum(int num1, int num2)
    {
        int add=num1+num2;
        return add;
    }
    public static void main(String arg[])
    {
        //Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sum(x,y);
    }
}