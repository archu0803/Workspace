package numberproblem;

public class Factorial {

    public static void main(String s[]) {
        int num = 3;//new Scanner(System.in).nextInt();
       int temp=1;
        // reversed integer is stored in variable
        while (num !=0) {
            temp=temp*(num);
            num--;
        }

            System.out.println(temp + " fac value ");

    }
}
