import java.util.*;

class Solutio {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value=0;
        for(int i=0;i<=s.length()-1;i++){
            int currentvalue=map.get(s.charAt(i));System.out.println(currentvalue);
            if(i<=s.length()-2&&currentvalue<map.get(s.charAt(i+1))){
               value-=currentvalue; 
            }
            else{
                value+=currentvalue;
            }
        }
        return value;
    }
}

public class romanToInt {
    public static void main(String[] args) {
    Solutio s = new Solutio();
    System.out.println(s.romanToInt("MCMXCIV"));
}
}
