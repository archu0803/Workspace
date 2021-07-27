package stringproblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation {
    private static List<String> checkWord= new ArrayList<>();
    public static void main(String[] args) {
        String s = "word";//new Scanner(System.in).nextLine();
        String check="ordw";
        permutation(s, "");
       // System.out.println("permutation String :" + permutation(s, ""));
        if(checkWord.contains(check)){
            System.out.println("permutation String present:" + check );
        }else{
            System.out.println("permutation String Not Present :" + check );
        }
    }

    public static void permutation(String str, String prefix) {
       if(str.length() ==0){
         //  System.out.println("permutation String :" + prefix );
           checkWord.add(prefix);
       }else {
           for (int i = 0; i < str.length(); i++) {
               String per = str.substring(0, i) + str.substring(i + 1);
               permutation(per, prefix + str.charAt(i));
           }
       }
     //  return null;
    }
}
