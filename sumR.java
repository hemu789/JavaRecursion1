import java.util.*;

public class sumR {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int smallans = sum(n - 1);

        return n + smallans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
}