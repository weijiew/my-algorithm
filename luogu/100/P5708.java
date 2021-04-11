import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int p = (1/2) * (a + b + c);
        System.out.println((p*(p - a)*(p - b)*(p - c))^(1/2));
    }
}
