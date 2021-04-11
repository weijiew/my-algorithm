import java.util.Scanner;

public class P5704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char b = a.charAt(0);
        System.out.println((char) (b - ('a' - 'A')));
//        System.out.println((char) (b - 32));
//        System.out.println(a.toUpperCase());
    }
}

