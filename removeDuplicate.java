
import java.util.*;
class Solution {
    public List<Integer> removeDuplicates(int[] nums) {
        Map <Integer, Integer> map= new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                result.add(nums[i]);
            }
        }
        return result;
    }
}
public class removeDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> result = solution.removeDuplicates(nums);

            System.out.println(result.size());
            System.out.println(result);
    }
}

