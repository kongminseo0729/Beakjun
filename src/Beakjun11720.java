import java.util.Scanner;

public class Beakjun11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s=sc.next();

        sc.close();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += s.charAt(i)-'0';
        }
        System.out.println(total);
    }
}
