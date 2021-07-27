package stringproblem;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    public static void main(String[] args)
    {
        String X = "silent";        // Tom Marvolo Riddle
        String Y = "listen";        // I am Lord Voldemort

        if (isAnagram(X, Y)) {
            System.out.print("Anagram");
        }
        else {
            System.out.print("Not an Anagram");
        }
    }

    private static boolean isAnagram(String x, String y) {
        if(x.length()!=y.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char check:x.toCharArray()){
            map.put(check, map.getOrDefault(check,0)+1);
        }
        Map<Character, Integer> map1 = new HashMap<>();
        for(char check1:x.toCharArray()){
            map1.put(check1, map1.getOrDefault(check1,0)+1);
        }
        return map1.equals(map);

    }
}
