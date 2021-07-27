package stringproblem;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s= "uoiu fdwsfd sdf";//new Scanner(System.in).nextLine();
        StringBuilder stringBuilder= new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            stringBuilder.append(s.charAt(i));
        };
         System.out.println("Reverse String :"+stringBuilder.toString());

    }



}
