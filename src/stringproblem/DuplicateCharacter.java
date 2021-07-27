package stringproblem;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public static void main(String[] args)
    {
        String X = "programming world";

       Map<Character, Integer> duplicate= new HashMap<>();
       for(char cha: X.toCharArray()){
           if(duplicate.containsKey(cha)){
               int count= duplicate.get(cha)+1;
               duplicate.put(cha, count);
               System.out.print(" Duplicate Count : "+count);
               System.out.print(" Duplicate character : "+cha+"\n");
           }else{
               duplicate.put(cha, 1);
           }
       }








    }


}
