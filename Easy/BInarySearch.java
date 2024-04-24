// https://leetcode.com/problems/binary-search/description/

package Easy;

class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(target >= nums[start] && target <= nums[end]){
            while(nums[start]<=nums[end]){
                int mid = start + (end - start) / 2;
                if(target == nums[mid]) return mid;
                if(target < nums[mid]) end = mid-1;
                else start = mid+1;
            }
            return -1;
        }
        return -1;
    }
}
