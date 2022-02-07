class Solution {
    /* public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            result += i-nums[i-1];
        }
        return result;
    } */
    public int missingNumber(int[] nums) { //binary search
    Arrays.sort(nums);
    int left = 0, right = nums.length;
    while(left<right){
        int mid = (left + right)/2;
        if(nums[mid]>mid) right = mid;
        else left = mid+1;
    }
    return left;
}
}
