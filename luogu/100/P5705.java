import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();
        char[] b = a.toCharArray();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.printf(String.valueOf(b[i]));
        }
        System.out.println();
    }
}

