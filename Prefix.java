import java.util.*;
class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String firstWord=strs[0];
        for(int i=0;i<firstWord.length();i++){
            char c=firstWord.charAt(i);System.out.println("i="+i+" c="+c);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    return firstWord.substring(0, i);
                }
            }
        }
        return firstWord;
    }
}

public class Prefix{
public static void main(String[] args) {
    longestCommonPrefix finder = new longestCommonPrefix();
    String[] words1 = {"flower", "flow", "flight"};
    System.out.println("Common Prefix: " + finder.longestCommonPrefix(words1)); 

}
}