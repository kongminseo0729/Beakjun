import java.util.Scanner;

public class Beakjun10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
           arr[i] = i+1;
        }

        for (int i=1; i < M; i++) {


        }

        for(int i=0;i<N;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();


    }
}
