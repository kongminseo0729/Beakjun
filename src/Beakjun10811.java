import java.util.Scanner;

public class Beakjun10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for (int i = 0; i <= N; i++) {
           arr[i] = i+1;
        }

        for (int i=0; i < M; i++) {
        int I=sc.nextInt()-1; //0번째 배열
        int J=sc.nextInt()-1; //4번쨰 배열

            while(I<J) {
                int temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        sc.close();
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
