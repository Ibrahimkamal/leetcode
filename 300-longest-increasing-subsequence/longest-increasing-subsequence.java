import java.util.Arrays;

class Solution {
    private int[] nums;
    private int[] memo;

    private int dp(int i) {
        if (memo[i] != -1) {
            return memo[i];
        }

        int maxLen = 1;  // The minimum LIS ending at i is 1 (the number itself)
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                maxLen = Math.max(maxLen, dp(j) + 1);
            }
        }

        memo[i] = maxLen;
        return maxLen;
    }

    public int lengthOfLIS(int[] nums) {
        this.nums = nums;
        this.memo = new int[nums.length];
        Arrays.fill(memo, -1);

        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            longest = Math.max(longest, dp(i));
        }

        return longest;
    }
}
