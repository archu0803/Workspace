package numberproblem;

public class Fibonacci {
    public static void main(String s[]) {
       // int ss = new Scanner(System.in).nextInt();
        for (int i = 1; i < 6; i++) {
            System.out.println(printFibonacci(i));
        }
    }

    private static int printFibonacci(int givenValue) {
        if (givenValue == 0) {
            System.out.println("Invalid value");
        }
        if (givenValue == 1 || givenValue == 2) {
            return 1;
        }
        return printFibonacci(givenValue - 1) + printFibonacci(givenValue - 2);

    }
}
