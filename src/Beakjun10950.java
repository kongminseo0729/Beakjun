import java.util.Scanner;

public class Beakjun10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            array[i] = A + B;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
