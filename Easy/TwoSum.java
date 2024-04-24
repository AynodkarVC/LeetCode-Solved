// https://leetcode.com/problems/two-sum/description/

package Easy;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        int[] ans1 = {i, j};
                        return ans1;
                    }
                }
            }
            return new int[0];
        }
}
