class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0, sum = 0;
        for(int i=0;i<nums.length;i++) { //Iterate over array nums and add to sums
            sum += nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            if(i!= 0) left += nums[i-1]; //check if i is not equal to 0 before adding values of nums[i-1] to left "sum" PIVOT CHECK
            if(sum - left - nums[i] == left){ //right sum minus the pivot (nums[i]) = left sum,  that means they are the same 
                return i; //return index because we found the pivot
            }
        }
        return -1; //if no value is found return -1
        // TC : O(N) - N is length of array nums
        // SC : O(1) - the space is used by left and sum
    }
}
