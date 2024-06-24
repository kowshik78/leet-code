import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int m=0;int n=s.length()-1;
        for(m=0;m<n;m++){
            if(s.charAt(m)==s.charAt(n)){
                n--;         
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
public class palindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int target = 1001;
        boolean result = sol.isPalindrome(target);
            System.out.println(result);
    }
}

