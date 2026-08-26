class Solution {

    public int func(int index,int n,int[] dp){

        if(index == n) return 1;
        if(index > n) return 0;

        if(dp[index] != -1) return dp[index];

         System.out.println(index);

        int left = func(index+1,n,dp);
        int right = func(index + 2,n,dp);
        dp[index] = left + right;

        return dp[index];
        
    }

    public int climbStairs(int n) {

        int[] dp = new int[n];
        
        Arrays.fill(dp,-1);
        return func(0,n,dp);
        
    }
}
