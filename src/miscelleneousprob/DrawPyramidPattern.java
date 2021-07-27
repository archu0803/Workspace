package miscelleneousprob;

public class DrawPyramidPattern {

    public static void main(String arr[]) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                string.append(" ").append("1");
            }
            string.append("\n ");
        }
        System.out.println(string.toString());
        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                string1.append(" ").append("1");
            }
            //string1.append("\n ");
        }
        System.out.println(string1.toString());

    }
}
