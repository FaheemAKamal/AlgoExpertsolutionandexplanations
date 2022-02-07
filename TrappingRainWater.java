class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int total = 0, level = 0;
        while (left < right) {
            if (height[left] > height[right]) { //if left height is greater than right height
                level = height[right] > level ? height[right] : level; //if right height is greater than level, store right height in level, otherwise keep level
                total += Math.max(level - height[right], 0); //Add max value of between 0 to level-height["right"] to total
                right--;
            } else { // if left height is smaller than right height
                level = height[left] > level ? height[left] : level; //if left height is greater than level, store left height in level, otherwise keep level
                total += Math.max(level - height[left], 0); //Add max value of between 0 to level-height["left"] to total
                left++;
            }
        }
        return total;
    }
}

// The idea is to traversal from both sides to the middle using two pointers. Always move the shorter height pointer to inner array. Keep a second height as water level. Once passing a height, compute the water trapped here by water level.

// TC : O(n) - single iteration of array SC: O(1) - constant space required for left, right, total and level
