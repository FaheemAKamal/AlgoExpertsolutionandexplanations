class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 0; //initialize variable max
        for(int num: nums) max = Math.max(num, max); //iterate over array nums and store max value of the array nums into max
        if(max == 1) return nums.length; //if max is 1, such that the only number in the array is 1, we return the length
        int[] dp = new int[max+1];
        for(int num: nums) dp[num] += num; //iterate over the array and store frequency in the dp array
        dp[dp.length-2] = Math.max(dp[dp.length-2],dp[dp.length-1]);
        for(int i = dp.length-3; i >= 0; i--){
            dp[i] = Math.max(dp[i+1],dp[i]+dp[i+2]); //iterate over i where inital value, store max if dp[i+1] is greater than
            // or equal to dp[i] + dp[i+2]
        }
        return dp[0]; //return value at index 0
    }
}
