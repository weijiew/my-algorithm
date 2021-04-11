import java.util.Scanner;

public class P5709 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        // 分母为零的情况
        if (t == 0){
            System.out.println(0);
            return;
        }
        int aa;
        if (s%t != 0) {
            aa = Math.max(m - (s / t) - 1,0);
        }else{
            aa = Math.max(m - (s / t),0);
        }
        System.out.println(aa);
    }
}
