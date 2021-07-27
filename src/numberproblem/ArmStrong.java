package numberproblem;

public class ArmStrong {
    public static void main(String s[]) {
        int num = 153;//new Scanner(System.in).nextInt();
        int mul = 0;
        int check = 0;
        int temp=num;
        // reversed integer is stored in variable
        while (num > 0) {
            mul = num % 10;// gets last digit
            num = num / 10;//takes out last two digit
            check = check + (mul * mul * mul);
        }
        if (check == temp) {
            System.out.println(temp + " is a Armstrong.");
        } else {
            System.out.println(temp + " is not a Armstrong.");
        }
    }
}
