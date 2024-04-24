// https://leetcode.com/problems/contains-duplicate/description/

package Easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<Integer>();
        for(int i : nums){
            if(arr.contains(i)){
                return true;
            }
            else arr.add(i);
        }
        return false;
    }
}
