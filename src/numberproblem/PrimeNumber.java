package numberproblem;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumber {
    public static void main(String[] ar) {
        if(isPrime()) {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }

    private static boolean isPrime() {
        int n=3;
        for(int i=2;i<n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
