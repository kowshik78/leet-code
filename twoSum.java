
import java.util.*;

class Solution {
    public List<int[]> twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            
            if (map.containsKey(comp)) {
                int[] solution = {map.get(comp), i};
                result.add(solution);
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, -4, 1};
        int target = 9;
        
        List<int[]> result = sol.twoSum(nums, target);
      
        for (int[] pair : result) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}


