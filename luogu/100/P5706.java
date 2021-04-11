import java.math.BigDecimal;
import java.util.Scanner;

public class P5706 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double t = cin.nextDouble();
        int b = cin.nextInt();
        double c = t/b;
        BigDecimal d = new BigDecimal(c);
        double e = d.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(e);
        System.out.println(b*2);
    }
}

