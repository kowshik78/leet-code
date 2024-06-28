
import java.util.*;
class Remove {
    public int[] removedElement(int[] nums, int val) {
        List<Integer> array= new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                //if(!array.contains(nums[i])){
                    array.add(nums[i]);
                //}
            }    
        }
        return array.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
public class removeElement {
    public static void main(String[] args) {
        Remove solution = new Remove();
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        int val=2;
        int[] result = solution.removedElement(nums,val);

            System.out.println(result.length);
                System.out.println(Arrays.toString(result));
    }
}