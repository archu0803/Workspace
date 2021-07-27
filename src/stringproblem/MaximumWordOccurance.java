package stringproblem;

import java.util.*;

public class MaximumWordOccurance {
    public static void main(String[] args) {
        // given set of keys
        List<String> dict = Arrays.asList(
                "code", "coder", "coding", "codable", "codec", "codecs", "coded",
                "codeless", "codec", "codecs", "codependence", "codex", "codify",
                "codependents", "codes", "code", "coder", "codesign", "codec",
                "codeveloper", "codrive", "codec", "codecs", "codiscovered", "codec"
        );

        findMaxOccurance(dict);
    }
    public static void findMaxOccurance(List<String> dic){
        Map<String, Integer> listMap = new HashMap<>();
        int maxVal=0;
        String maxStr="";
        for(String check:dic) {
            if (listMap.containsKey(check)) {
              listMap.put(check,listMap.get(check)+1);
            }else{
                listMap.put(check,1);
            }
        }
        for(Map.Entry<String, Integer> entry: listMap.entrySet()){

            if(maxVal< entry.getValue()){
                maxVal= entry.getValue();
                maxStr= entry.getKey();
            }
        }
        System.out.println("max String occurance :"+maxStr +", "+maxVal);
    }

}
